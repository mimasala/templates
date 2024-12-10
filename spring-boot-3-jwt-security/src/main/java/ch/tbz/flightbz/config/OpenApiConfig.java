package ch.tbz.flightbz.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Mischa Strauss",
                        email = "mischa.strauss@edu.tbz.ch"
                ),
                description = """
                        OpenApi documentation for Spring Security
                        **Additional Contacts:**
                         - Jason Gautschi (jason.gautschi@edu.tbz.ch)
                         - Leon Babic (leon.babic@edu.tbz.ch)
                         - Bianca Zieba (bianca@edu.tbz.ch)
                        """,
                title = "OpenApi specification",
                version = "1.0",
                license = @License(
                        name = "MIT",
                        url = "https://mit-license.org/"
                )
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "https://example.com"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
