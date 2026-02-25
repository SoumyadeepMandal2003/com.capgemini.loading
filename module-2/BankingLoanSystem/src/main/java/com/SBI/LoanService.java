package com.SBI;


import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
public class LoanService {

    private LoanValidator loanValidator;
    private AuditService auditService;


    @Autowired
    public LoanService(@Qualifier("incomeValidator") LoanValidator loanValidator) {
        this.loanValidator = loanValidator;
    }


    @Autowired
    public void setAuditService(AuditService auditService) {
        this.auditService = auditService;
    }


    public void processLoan(double amount) {
        loanValidator.validateLoan(amount);
    }
}
