package com.severinu.quarkus.microservices;

import com.severinu.quarkus.microservices.number.IsbnNumbers;
import com.severinu.quarkus.microservices.number.IsbnNumbersGenerator;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Path("/api/numbers")
public class NumberResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public IsbnNumbers generateIsbnNumbers() {
        IsbnNumbers isbNumbers = IsbnNumbersGenerator.generate();
        log.info("Generating new set of ISBN numbers: {}", isbNumbers);
        return isbNumbers;
    }


    @GET
    @Path("/healthcheck")
    @Produces(MediaType.TEXT_PLAIN)
    public String healthCheck() {
        log.info("Health-check endpoint called");
        return "OK Numbers";
    }
}
