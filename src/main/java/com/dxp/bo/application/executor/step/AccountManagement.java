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
public class AccountManagement implements StepExecutor {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public boolean execute(Loan loan) {
        log.info("invoked for :{}",loan.getId());
        if(loan.getPhase().equals(PhaseValues.Repayment.phase)){
            Step step = new Step(StepValues.AccountManagement.step);
            step.setStartDate(new Date());
            loan.getPhase().setSteps(Arrays.asList(step));
            Loan loanPersisted = loanRepository.save(loan);
        }
        return true;
    }
}
