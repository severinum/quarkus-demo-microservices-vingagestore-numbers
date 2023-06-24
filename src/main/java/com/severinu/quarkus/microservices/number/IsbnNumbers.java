package com.severinu.quarkus.microservices.number;


import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import lombok.*;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Schema(description = "Several ISBN formats")
public class IsbnNumbers {

    @JsonbProperty("isbn_10")
    @Schema(required = true)
    public String isbn10;

    @JsonbProperty("isbn_13")
    @Schema(required = true)
    public String isbn13;

    @JsonbTransient
    public Instant dateCreated;
}
