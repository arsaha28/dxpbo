package com.dxp.bo.application.batch.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class DirectDebitTransactionInformation {

    @XmlElement(name = "PmtId")
    private PaymentId paymentId;

    @XmlElement(name = "InstdAmt")
    private InstructedAmount instructedAmount;

    @XmlElement(name = "DrctDbtTx")
    private DirectDebitTransaction directDebitTransaction;

    @XmlElement(name = "DbtrAgt")
    private DebtorAgent debtorAgent;

    @XmlElement(name = "Dbtr")
    private Debtor debtor;

    @XmlElement(name = "DbtrAcct")
    private DebtorAccount debtorAccount;

    @XmlElement(name = "RmtInf")
    private RemittanceInformation remittanceInformation;
}
