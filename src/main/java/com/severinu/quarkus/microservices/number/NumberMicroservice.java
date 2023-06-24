package com.severinu.quarkus.microservices.number;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Number API",
                description = "Generates ISBN book numbers",
                version = "1.0",
                contact = @Contact(name = "@severinum")
        )
)
@ApplicationPath("/")
public class NumberMicroservice extends Application {

}
