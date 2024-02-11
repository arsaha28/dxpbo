package com.dxp.bo.application.model;

public enum PhaseValues {

    PreApplication("Pre-Application"),
    Application("Application"),
    Processing(""),
    ApprovalAndDisbursement("Loan Processing"),
    Repayment("Repayment"),
    Monitoring("Monitoring and Communication"),
    Closure("Closure"),
    PostClosure("Post-Closure ");

    public final String phase;
    PhaseValues(String phase) {
        this.phase = phase;
    }
}
