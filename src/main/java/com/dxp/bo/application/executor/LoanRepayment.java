package com.dxp.bo.application.executor;

import com.dxp.bo.application.model.Loan;
import org.springframework.stereotype.Component;

@Component
public class LoanRepayment implements PhaseStepExecutor{
    @Override
    public boolean execute(Loan loan) {
        return false;
    }
}
