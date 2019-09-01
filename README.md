# `wordcount-with-java-stream`

A command-line interface that counts distinct words from a file.

## Prerequisite

Install Java 8.

## Build

    ./mvnw compile

## Run

### Run as a Java program

    # On a small text file
    java -cp target/classes org.nicokosi.WordCount /etc/hosts

    # On a large text file
    wget \
        --output-document=/tmp/pg20417.txt \
        http://www.gutenberg.org/cache/epub/20417/pg20417.txt
    java -cp target/classes org.nicokosi.WordCount /tmp/pg20417.txt

### Run as an executable

Run the script `./generate-executable.sh` that installs [GraalVM](https://www.graalvm.org/) via [SDKMAN!](https://sdkman.io/) then generates an executable named `wordcount-with-java-stream`.
Then, run:

    ```sh
    ./wordcount-with-java-stream PATH_OF_A_TEXT_FILE
    ```
