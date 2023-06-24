package com.severinu.quarkus.microservices.number;

import java.time.Instant;
import java.util.Random;

public class IsbnNumbersGenerator {

    public static IsbnNumbers generate() {
        String isbn10 = "10-" + new Random().nextInt(100_000);
        String isbn13 = "13-" + new Random().nextInt(100_000_000);
        return new IsbnNumbers(isbn10, isbn13, Instant.now());
    }

}
