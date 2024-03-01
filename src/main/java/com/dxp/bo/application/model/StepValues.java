package com.dxp.bo.application.model;

public enum StepValues {

    Research("Research and Planning"),
    ApplicationSubmission("Application Submission"),
    DocumentVerification("Document Verification"),
    CreditCheck("Credit Check"),
    Underwriting("Underwriting"),
    LoanApproval("Loan Approval"),
    LoanDisbursement("Loan Disbursement"),
    LoanRepayment("Loan Repayment"),
    AccountManagement("Account Management"),

    COMMUNICATION("Communication"),

    LoanRepaymentCompletion("Loan Repayment Completion"),
    Closure_Documentation("Closure Documentation"),
    PostLoanRelationship("Post-Loan Relationship");


    public final String step;
    StepValues(String step) {
        this.step = step;
    }
}
