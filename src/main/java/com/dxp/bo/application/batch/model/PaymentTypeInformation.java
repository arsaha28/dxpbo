package com.dxp.bo.application.batch.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class PaymentTypeInformation {

    @XmlElement(name = "SvcLvl")
    private ServiceLevel serviceLevel;

    @XmlElement(name = "LclInstrm")
    private LocalInstrument localInstrument;

    @XmlElement(name = "SeqTp")
    private String sequenceType;
}
