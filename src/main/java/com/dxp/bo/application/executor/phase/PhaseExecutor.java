package com.dxp.bo.application.executor.phase;

import com.dxp.bo.application.model.Loan;

public interface PhaseExecutor {

    boolean execute(Loan loan);
}
