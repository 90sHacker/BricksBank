package com.bricksbank.loans.dto;


import lombok.Data;

@Data
public class LoansDto {

    private String mobileNumber;

    private Long loanNumber;

    private Long totalLoan;

    private Long amountPaid;

    private Long outstandingAmount;
}
