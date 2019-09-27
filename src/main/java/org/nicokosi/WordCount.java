package org.nicokosi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.System.*;
import static java.text.MessageFormat.format;

/**
 * Basic word counter
 */
public class WordCount {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            err.println("Please provide an argument for file path");
            exit(-1);
        }
        String filePath = args[0];
        out.print(format("File {0}", filePath));
        out.println(format(" contains {0} words", countWords(lines(filePath))));
    }

    static long countWords(final Stream<String> lines) {
        return lines
                .map(line -> line.split("\\s+"))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .distinct()
                .count();
    }

    static Stream<String> lines(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath));
    }

}
