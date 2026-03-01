package com.bricksbank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Schema(name = "Accounts", description = "Accounts information schema")
public class AccountsDto {

    @Schema(description = "Customer account number")
    @NotEmpty(message = "Account number must not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(description = "Customer account Type", example = "Savings")
    @NotEmpty(message = "Account Type must not be null or empty")
    private String accountType;

    @Schema(description = "Customer branch address", example = "123 Main Street")
    @NotEmpty(message = "Branch Address must not be null or empty")
    private String branchAddress;
}
