#!/usr/bin/env bash

echo "Executing for non-pull request i.e branch"

./gradlew clean build assembleRelease
