package com.dxp.bo.application.batch.directdebit.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;


@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class CustomerDirectDebitInitiation {

    @XmlElement(name = "GrpHdr")
    private GroupHeader groupHeader;

    @XmlElement(name = "PmtInf")
    private PaymentInformation paymentInformation;

    public GroupHeader getGroupHeader() {
        return groupHeader;
    }

    public void setGroupHeader(GroupHeader groupHeader) {
        this.groupHeader = groupHeader;
    }

    public PaymentInformation getPaymentInformation() {
        return paymentInformation;
    }

    public void setPaymentInformation(PaymentInformation paymentInformation) {
        this.paymentInformation = paymentInformation;
    }
}
