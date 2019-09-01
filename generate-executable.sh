#!/bin/bash

# Fail on error
set -e

echo "Install GraalVM via SDKMAN!:"
curl --silent "https://get.sdkman.io" | bash || echo 'SDKMAN! already installed'
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk use java 19.2.0-grl # Newer versions can be found via `sdk list java`

echo "Build executable from JAR via GraalVM:"
gu install native-image
native-image \
  --no-fallback \
  --no-server \
  -cp target/classes \
  org.nicokosi.WordCount \
  wordcount-with-java-stream

echo "Generated executable: $(ls ./wordcount-with-java-stream)"