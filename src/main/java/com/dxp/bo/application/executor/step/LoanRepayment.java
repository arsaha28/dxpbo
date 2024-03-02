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
public class LoanRepayment implements StepExecutor {

    @Autowired
    private LoanRepository loanRepository;
    @Override
    public boolean execute(Loan loan) {
        log.info("invoked for :{}",loan.getId());
        Phase phase = new Phase(PhaseValues.Repayment.phase);
        phase.setStartDate(new Date());

        Step step = new Step(StepValues.LoanRepayment.step);
        step.setStartDate(new Date());
        phase.setSteps(Arrays.asList(step));
        loan.getPhase().setEndDate(new Date());
        loan.getAllPhases().add(phase);
        Loan loanPersisted = loanRepository.save(loan);
        return false;
    }
}
