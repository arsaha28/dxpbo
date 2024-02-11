package com.dxp.bo.application.batch.directdebit.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class MandateRelatedInformation {

    @XmlElement(name = "MndtId")
    private String mandateId;

    @XmlElement(name = "DtOfSgntr")
    private String dateOfSignature;

    // Getters and setters
}