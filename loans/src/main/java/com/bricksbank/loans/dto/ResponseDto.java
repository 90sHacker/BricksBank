package com.bricksbank.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(name="Response", description = "HTTP Response Schema")
public class ResponseDto {

    @Schema(description = "Response status code")
    private String statusCode;

    @Schema(description = "Response status message")
    private String statusMessage;
}
