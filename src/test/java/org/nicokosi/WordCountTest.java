package org.nicokosi;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {

    @Test
    void zero_word() {
        assertEquals(0L, WordCount.countWords(Stream.empty()));
    }

    @Test
    void one_word() {
        assertEquals(1L, WordCount.countWords(Stream.of("hello")));
    }

    @Test
    void two_words() {
        assertEquals(2L, WordCount.countWords(Stream.of("hello world")));
    }

    @Test
    void sentence() {
        assertEquals(8L, WordCount.countWords(Stream.of("The quick brown fox jumps over the lazy dog.")));
    }

    @Test
    void duplications_with_case_variations() {
        assertEquals(1L, WordCount.countWords(Stream.of("hello Hello HellO hello")));
    }

}