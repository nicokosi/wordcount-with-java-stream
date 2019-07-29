Count words from a file

# Prerequisite

Install Java 8.

# Build

    ./mvnw compile

# Run

    # On a small text file
    java -cp target/classes org.nicokosi.WordCount /etc/hosts

    # On a large text file
    wget \
        --output-document=/tmp/pg20417.txt \
        http://www.gutenberg.org/cache/epub/20417/pg20417.txt
    java -cp target/classes org.nicokosi.WordCount /tmp/pg20417.txt

# Run as an executable

Install [GraalVM](https://www.graalvm.org/), for instance via [SDKMAN!](https://sdkman.io/):

    curl --silent "https://get.sdkman.io" | bash || echo 'SDKMAN! already installed'
    source "$HOME/.sdkman/bin/sdkman-init.sh"
    sdk use java 19.1.1-grl # Newer versions can be found via `sdk list java`

Then generate an executable:

    gu install native-image
    native-image \
        --no-fallback \
        --no-server \
        -cp target/classes \
        org.nicokosi.WordCount \
        wordcount-with-java-stream

And run it:

    ./wordcount-with-java-stream /etc/hosts
