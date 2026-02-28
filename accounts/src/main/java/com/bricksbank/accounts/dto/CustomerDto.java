package com.bricksbank.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;


@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min=5, max = 30, message = "Customer name must be between 5 and 30 characters")
    private String name;

    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Must be a valid email")
    private String email;

    @NotEmpty
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
