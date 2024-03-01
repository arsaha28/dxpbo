package com.dxp.bo.application.executor;

import com.dxp.bo.application.model.*;

public class ApplicationSubmissionExecutor implements PhaseStepExecutor{
    @Override
    public boolean execute(Loan loan) {
        Phase  loanProcessingPhase = new Phase(PhaseValues.Processing.phase);
        loanProcessingPhase.getSteps().add(new Step(StepValues.DocumentVerification.step));
        loan.setPhase(loanProcessingPhase);
        return false;
    }
}
