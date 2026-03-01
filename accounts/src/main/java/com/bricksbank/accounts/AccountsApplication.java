package com.bricksbank.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info=@Info(
				title = "Accounts Microservice REST API Documentation",
				description = "Bricks Bank Accounts Microservice REST API Documentation",
				version="v1",
				contact = @Contact(
						name="Tito Shobanke",
						email = "tito@bricksbank.com",
						url="https://www.bb.dummy"
				),
				license = @License(
						name = "Apache 2.0",
						url="https://www.bb.dummy"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Reference Guide",
				url = "https:www.bb.dummy/reference/learn"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
