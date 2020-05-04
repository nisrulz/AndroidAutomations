# Travis setup for keystore file

Install travis command line:

```bash
sudo gem install travis
```

Next, login into Travis using Github Oauth Token

```bash
travis login --github-token your_github_oauth_token
```

Encrypt the keystore file:

```bash
travis encrypt-file ./keystore.jks
```

This will generate a `keystore.jks.enc` file. You should remove the `keystore.jks` from the repo, but keep it safe.

Now, add the output line to `before_install` block in travis config:

```yaml
before_install:
  - openssl aes-256-cbc -K $encrypted_48536eba9c94_key -iv $encrypted_48536eba9c94_iv -in ./keystore/keystore.jks.enc -out ./keystore/keystore.jks -d
```

Next, the keystore password and key password need to be added to the travis config. To do that navigate to settings and under **Environment Variables**, define below key-value pair

```
storePassword=example
keyAlias=example
keyPassword=example
```

These are then used during the build time to write to `keystore/keystore.properties` file, which in turn is used to build a signed apk via `build.gradle` setup.

```yaml
before_deploy:
  - echo "storePassword=$storePassword" >> ./keystore/keystore.properties
  - echo "keyAlias=$keyAlias" >> ./keystore/keystore.properties
  - echo "keyPassword=$keyPassword" >> ./keystore/keystore.properties
```

Before you can deploy, you need to get the encrypted apikey.

```bash
travis encrypt apikey
```

Next, to deploy to Github release:

```yaml
before_deploy:
  - cd app/build/outputs/apk/

deploy:
  provider: releases
  skip_cleanup: true
  overwrite: true
  api_key:
    secure: replace_with_encrypted_apikey_from_last_step
  file_glob: true
  file: release/*
  on:
    repo: nisrulz/AndroidAutomations
    tags: true
```

Now, simply tag a commit and see the release show up in Github releases.