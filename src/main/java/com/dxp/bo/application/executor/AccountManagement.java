package com.dxp.bo.application.executor;

import com.dxp.bo.application.model.Loan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AccountManagement implements PhaseStepExecutor{
    @Override

    public boolean execute(Loan loan) {
        log.info("Account management invoked for :{}",loan.getId());
        return true;
    }
}
