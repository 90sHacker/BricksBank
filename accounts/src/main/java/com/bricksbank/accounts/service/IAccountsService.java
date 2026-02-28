package com.bricksbank.accounts.service;

import com.bricksbank.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - Customer Data Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return An Accounts for a provided mobile number
     */
    CustomerDto fetchAccount(String mobileNumber);


    /**
     *
     * @param customerDto
     * @return Accounts update status - success or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Delete Status - success or not
     */
    boolean deleteAccount(String mobileNumber);
}
