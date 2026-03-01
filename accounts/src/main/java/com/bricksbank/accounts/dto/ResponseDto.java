package com.bricksbank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
@Schema(name ="Response", description = "HTTP response Schema")
public class ResponseDto {

    @Schema(description = "Response status code")
    private String statusCode;

    @Schema(description = "Response status message")
    private String statusMessage;

}
