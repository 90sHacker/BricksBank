package com.bricksbank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;


@Data
@Schema(name = "Customer", description = "Customer Information Schema")
public class CustomerDto {

    @Schema(description = "Customer name", example = "Jack Ryan")
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min=5, max = 30, message = "Customer name must be between 5 and 30 characters")
    private String name;

    @Schema(description = "Email Address", example = "jackryan@bricksbank.com")
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Must be a valid email")
    private String email;

    @Schema(description = "Customer mobile number", example = "8099822383")
    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Customer Account Details")
    private AccountsDto accountsDto;
}
