package com.dxp.bo.application.executor.step;

import com.dxp.bo.application.model.Loan;

public interface StepExecutor {

    boolean execute(Loan loan);
}
