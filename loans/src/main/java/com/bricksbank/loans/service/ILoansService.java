package com.bricksbank.loans.service;

import com.bricksbank.loans.dto.LoansDto;

public interface ILoansService {

    void createLoan(LoansDto loansDto);

    LoansDto fetchLoan(String mobileNumber);
}
