package com.bricksbank.loans.mapper;

import com.bricksbank.loans.dto.LoansDto;
import com.bricksbank.loans.entity.Loans;

public class LoansMapper {

    public static LoansDto mapToLoansDto(Loans loans, LoansDto loansDto) {
        loansDto.setLoanNumber(loans.getLoanNumber());
        loansDto.setMobileNumber(loans.getMobileNumber());
        loansDto.setOutstandingAmount(loans.getOutstandingAmount());
        loansDto.setTotalLoan(loans.getTotalLoan());
        loansDto.setAmountPaid(loans.getAmountPaid());

        return loansDto;
    }

    public static Loans mapToLoans(LoansDto loansDto, Loans loans) {
        loans.setLoanNumber(loansDto.getLoanNumber());
        loans.setMobileNumber(loansDto.getMobileNumber());
        loans.setOutstandingAmount(loansDto.getOutstandingAmount());
        loans.setTotalLoan(loans.getTotalLoan());
        loans.setAmountPaid(loans.getAmountPaid());

        return loans;
    }
}
