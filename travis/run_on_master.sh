#!/usr/bin/env bash

echo "Executing for master branch"

./gradlew -q clean build assembleRelease
