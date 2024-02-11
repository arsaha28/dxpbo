package com.dxp.bo.application.generator;

import com.dxp.bo.application.model.Phase;
import com.dxp.bo.application.model.Step;

import java.util.ArrayList;
import java.util.List;

public class LoanLifecycleManager {

    private List<Phase> phases;

    public LoanLifecycleManager() {
        this.phases = initializePhases();
    }

    private List<Phase> initializePhases() {
        // Define the phases and steps in the loan lifecycle
        List<Phase> phases = new ArrayList<>();

        Phase preApplicationPhase = new Phase("Pre-Application Phase");
        preApplicationPhase.getSteps().add (new Step("Research and Planning"));

        Phase applicationPhase = new Phase("Application Phase");
        applicationPhase.getSteps().add(new Step("Application Submission"));

        // ... (other phases and steps)

        phases.add(preApplicationPhase);
        phases.add(applicationPhase);

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
