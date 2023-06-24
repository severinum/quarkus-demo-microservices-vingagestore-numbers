package com.severinu.quarkus.microservices.number;

import com.severinu.quarkus.microservices.number.IsbnNumbers;
import com.severinu.quarkus.microservices.number.IsbnNumbersGenerator;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;


@Slf4j
@Path("/api/numbers")
@Tag(name = "Number REST Endpoint")
public class NumberResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Generates ISBN numbers for a book")
    public IsbnNumbers generateIsbnNumbers() {
        IsbnNumbers isbNumbers = IsbnNumbersGenerator.generate();
        log.info("Generating new set of ISBN numbers: {}", isbNumbers);
        return isbNumbers;
    }


    @GET
    @Path("/healthcheck")
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(summary = "Just a dummy healthcheck endpoint")
    public String healthCheck() {
        log.info("Health-check endpoint called");
        return "OK Numbers";
    }
}
