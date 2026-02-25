package com.SBI;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditScoreValidator implements LoanValidator{
    @Override
    public boolean validateLoan(double amount){
        System.out.println("validate Loan using Credit Score");
        return true;
    }
}
