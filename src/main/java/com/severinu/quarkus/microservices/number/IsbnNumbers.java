package com.severinu.quarkus.microservices.number;

import lombok.*;

import java.time.Instant;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class IsbnNumbers {

    public String isbn10;
    public String isbn13;
    public Instant generationDate;
}
