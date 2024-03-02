package com.dxp.bo.application.executor.step;

import com.dxp.bo.application.model.*;
import com.dxp.bo.application.repository.LoanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;

@Component
@Slf4j
public class ApplicationSubmissionExecutor implements StepExecutor {

    @Autowired
    private LoanRepository loanRepository;
    @Override
    public boolean execute(Loan loan) {
        log.info("invoked for :{}",loan.getId());
        Phase applicationPhase = new Phase(PhaseValues.Application.phase);
        applicationPhase.setStartDate(new Date());

        Step step = new Step(StepValues.ApplicationSubmission.step);
        step.setStartDate(new Date());
        applicationPhase.setSteps(Arrays.asList(step));
        loan.setAllPhases(Arrays.asList(applicationPhase));
        Loan loanPersisted = loanRepository.save(loan);
        return false;
    }
}
