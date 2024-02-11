package com.dxp.bo.application.batch.directdebit.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ServiceLevel {
    @XmlElement(name = "Cd")
    private String code;
}
