Count words from a file

# Prerequisite

Install Maven and Java 8.

# Build

    mvn compile

# Run

    wget --output-document=/tmp/pg20417.txt http://www.gutenberg.org/cache/epub/20417/pg20417.txt
    java -cp target/classes org.nicokosi.WordCount /tmp/pg20417.txt