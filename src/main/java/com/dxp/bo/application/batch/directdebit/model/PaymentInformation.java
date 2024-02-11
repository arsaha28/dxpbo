package com.dxp.bo.application.batch.directdebit.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class PaymentInformation {

    @XmlElement(name = "PmtInfId")
    private String paymentInformationId;

    @XmlElement(name = "PmtMtd")
    private String paymentMethod;

    @XmlElement(name = "BtchBookg")
    private boolean batchBooking;

    @XmlElement(name = "NbOfTxs")
    private int numberOfTransactions;

    @XmlElement(name = "CtrlSum")
    private String controlSum;

    @XmlElement(name = "PmtTpInf")
    private PaymentTypeInformation paymentTypeInformation;

    @XmlElement(name = "ReqdColltnDt")
    private String requiredCollectionDate;

    @XmlElement(name = "Cdtr")
    private Creditor creditor;

    @XmlElement(name = "CdtrAcct")
    private CreditorAccount creditorAccount;

    @XmlElement(name = "CdtrAgt")
    private CreditorAgent creditorAgent;

    @XmlElement(name = "ChrgBr")
    private String chargeBearer;

    @XmlElement(name = "CdtrSchmeId")
    private CreditorSchemeIdentification creditorSchemeIdentification;

    @XmlElement(name = "DrctDbtTxInf")
    private List<DirectDebitTransactionInformation> directDebitTransactionInformationList;

}
