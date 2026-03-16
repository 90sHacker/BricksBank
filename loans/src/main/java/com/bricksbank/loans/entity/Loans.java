package com.bricksbank.loans.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Loans extends BaseEntity {

    @Id
    private Long loanId;

    private String mobileNumber;

    private Long loanNumber;

    private Long totalLoan;

    private Long amountPaid;

    private Long outstandingAmount;
}
