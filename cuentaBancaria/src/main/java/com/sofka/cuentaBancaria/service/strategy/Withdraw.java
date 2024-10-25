package com.sofka.cuentaBancaria.service.strategy;

import com.sofka.cuentaBancaria.model.TransactionHistory;
import com.sofka.cuentaBancaria.model.UserBalance;

import java.math.BigDecimal;


public class Withdraw implements TypeTransaction {
    @Override
    public BigDecimal movement(TransactionHistory transactionHistory, UserBalance userBalance) {
        return userBalance.getBalance().subtract(transactionHistory.getTotal().add(new BigDecimal(1)));
    }
}