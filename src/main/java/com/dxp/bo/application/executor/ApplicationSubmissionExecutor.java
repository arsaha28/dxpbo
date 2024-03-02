package com.dxp.bo.application.executor;

import com.dxp.bo.application.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApplicationSubmissionExecutor implements PhaseStepExecutor{
    @Override
    public boolean execute(Loan loan) {
        log.info("Account management invoked for :{}",loan.getId());

        Phase  loanProcessingPhase = new Phase(PhaseValues.Processing.phase);
        loanProcessingPhase.getSteps().add(new Step(StepValues.DocumentVerification.step));
        loan.setPhase(loanProcessingPhase);
        return false;
    }
}
