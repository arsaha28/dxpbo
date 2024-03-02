package com.dxp.bo.application.controller.loan;


import com.dxp.bo.application.model.*;
import com.dxp.bo.application.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanRepository loanRepository;
    @PostMapping
    public ResponseEntity<Loan> loan(@RequestBody Loan loan) {
        Phase  applicationPhase = new Phase(PhaseValues.Application.phase);
        applicationPhase.setStartDate(new Date());

        Step  step = new Step(StepValues.ApplicationSubmission.step);
        step.setStartDate(new Date());
        applicationPhase.setSteps(Arrays.asList(step));
        loan.setAllPhases(Arrays.asList(applicationPhase));
        Loan loanPersisted = loanRepository.save(loan);

        return new ResponseEntity<>(loanPersisted, HttpStatus.OK);
    }
}
