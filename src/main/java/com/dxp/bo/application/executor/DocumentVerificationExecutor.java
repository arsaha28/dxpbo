package com.dxp.bo.application.executor;

import com.dxp.bo.application.model.Loan;

public class DocumentVerificationExecutor implements PhaseStepExecutor{
    @Override
    public boolean execute(Loan loan) {
        return false;
    }
}
