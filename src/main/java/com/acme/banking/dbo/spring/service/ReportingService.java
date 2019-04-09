package com.acme.banking.dbo.spring.service;

import com.acme.banking.dbo.spring.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportingService {
    @Autowired private CurrencyService currencyService;
    @Autowired private AccountRepository accountRepository;

    public double getUsdAmountFor(long accountId) {
        double rurAmount = accountRepository.findById(1L).get().getAmount();
        return currencyService.getUsdRateForRur() * rurAmount;
    }


}
