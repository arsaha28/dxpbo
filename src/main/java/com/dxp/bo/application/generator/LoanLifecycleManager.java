package com.dxp.bo.application.generator;

import com.dxp.bo.application.model.LoanPhase;
import com.dxp.bo.application.model.LoanStep;

import java.util.ArrayList;
import java.util.List;

public class LoanLifecycleManager {

    private List<LoanPhase> phases;

    public LoanLifecycleManager() {
        this.phases = initializePhases();
    }

    private List<LoanPhase> initializePhases() {
        // Define the phases and steps in the loan lifecycle
        List<LoanPhase> phases = new ArrayList<>();

        LoanPhase preApplicationPhase = new LoanPhase("Pre-Application Phase");
        preApplicationPhase.getSteps().add (new LoanStep("Research and Planning"));

        LoanPhase applicationPhase = new LoanPhase("Application Phase");
        applicationPhase.getSteps().add(new LoanStep("Application Submission"));

        // ... (other phases and steps)

        phases.add(preApplicationPhase);
        phases.add(applicationPhase);

        return phases;
    }

    public void printLoanLifecycle() {
        for (LoanPhase phase : phases) {
            System.out.println(phase.getName());
            for (LoanStep step : phase.getSteps()) {
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
