package com.dxp.bo.application.executor.phase;

import com.dxp.bo.application.model.Loan;
import com.dxp.bo.application.repository.LoanRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MonitoringPhaseExecutor implements PhaseExecutor{

    @Autowired
    private LoanRepository loanRepository;
    @Override
    public boolean execute(Loan loan) {
        return false;
    }
}
