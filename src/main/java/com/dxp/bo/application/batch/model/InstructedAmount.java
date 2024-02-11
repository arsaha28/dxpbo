package com.dxp.bo.application.batch.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class InstructedAmount {

    @XmlAttribute(name = "Ccy")
    private String currency;

    @XmlValue
    private String value;
}
