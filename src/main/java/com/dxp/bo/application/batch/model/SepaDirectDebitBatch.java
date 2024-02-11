package com.dxp.bo.application.batch.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.001.02")
@XmlAccessorType(XmlAccessType.FIELD)
public class SepaDirectDebitBatch {

    @XmlElement(name = "CstmrDrctDbtInitn")
    private CustomerDirectDebitInitiation customerDirectDebitInitiation;

    public CustomerDirectDebitInitiation getCustomerDirectDebitInitiation() {
        return customerDirectDebitInitiation;
    }

    public void setCustomerDirectDebitInitiation(CustomerDirectDebitInitiation customerDirectDebitInitiation) {
        this.customerDirectDebitInitiation = customerDirectDebitInitiation;
    }
}
