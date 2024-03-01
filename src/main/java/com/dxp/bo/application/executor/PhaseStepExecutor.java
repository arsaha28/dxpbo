package com.dxp.bo.application.executor;

import com.dxp.bo.application.model.Loan;

public interface PhaseStepExecutor {

    boolean execute(Loan loan);
}
