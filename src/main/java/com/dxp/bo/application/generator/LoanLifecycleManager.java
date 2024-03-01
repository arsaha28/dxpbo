package com.dxp.bo.application.generator;

import com.dxp.bo.application.model.Phase;
import com.dxp.bo.application.model.PhaseValues;
import com.dxp.bo.application.model.Step;
import com.dxp.bo.application.model.StepValues;

import java.util.ArrayList;
import java.util.List;

public class LoanLifecycleManager {

    private List<Phase> phases;

    public LoanLifecycleManager() {
        this.phases = initializePhases();
    }

    private List<Phase> initializePhases() {
        List<Phase> phases = new ArrayList<>();

        Phase  phase = new Phase(PhaseValues.PreApplication.phase);
        phase.getSteps().add(new Step(StepValues.Research.step));

        Phase  applicationPhase = new Phase(PhaseValues.Application.phase);
        applicationPhase.getSteps().add(new Step(StepValues.ApplicationSubmission.step));


        Phase  loanProcessingPhase = new Phase(PhaseValues.Processing.phase);
        loanProcessingPhase.getSteps().add(new Step(StepValues.DocumentVerification.step));
        loanProcessingPhase.getSteps().add(new Step(StepValues.CreditCheck.step));
        loanProcessingPhase.getSteps().add(new Step(StepValues.Underwriting.step));

        Phase  approvalAndDisbursementPhase = new Phase(PhaseValues.ApprovalAndDisbursement.phase);
        approvalAndDisbursementPhase.getSteps().add(new Step(StepValues.LoanApproval.step));
        approvalAndDisbursementPhase.getSteps().add(new Step(StepValues.LoanDisbursement.step));

        Phase  repaymentPhase = new Phase(PhaseValues.Repayment.phase);
        repaymentPhase.getSteps().add(new Step(StepValues.LoanRepayment.step));
        repaymentPhase.getSteps().add(new Step(StepValues.AccountManagement.step));

        Phase  monitoringAndCommunicationPhase = new Phase(PhaseValues.Monitoring.phase);
        monitoringAndCommunicationPhase.getSteps().add(new Step(StepValues.COMMUNICATION.step));


        Phase  closurePhase = new Phase(PhaseValues.Closure.phase);
        closurePhase.getSteps().add(new Step(StepValues.LoanRepaymentCompletion.step));
        closurePhase.getSteps().add(new Step(StepValues.Closure_Documentation.step));


        Phase  postClosurePhase = new Phase(PhaseValues.PostClosure.phase);
        postClosurePhase.getSteps().add(new Step(StepValues.PostLoanRelationship.step));



        phases.add(phase);
        phases.add(applicationPhase);
        phases.add(loanProcessingPhase);
        phases.add(approvalAndDisbursementPhase);
        phases.add(repaymentPhase);
        phases.add(monitoringAndCommunicationPhase);
        phases.add(closurePhase);
        phases.add(postClosurePhase);

        return phases;
    }

    public void printLoanLifecycle() {
        for (Phase phase : phases) {
            System.out.println(phase.getName());
            for (Step step : phase.getSteps()) {
                System.out.println("  - " + step.getName());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LoanLifecycleManager lifecycleManager = new LoanLifecycleManager();
        lifecycleManager.printLoanLifecycle();
    }
}
