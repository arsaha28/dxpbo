package com.dxp.bo.application.executor.step;

import com.dxp.bo.application.model.*;
import com.dxp.bo.application.repository.LoanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ClosureDocumentationExecutor implements StepExecutor {

    @Autowired
    private LoanRepository loanRepository;
    @Override
    public boolean execute(Loan loan) {
        log.info("invoked for :{}",loan.getId());
        return false;
    }
}
