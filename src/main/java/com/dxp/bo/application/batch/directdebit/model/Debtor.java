package com.dxp.bo.application.batch.directdebit.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;


@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Debtor {

    @XmlElement(name = "Nm")
    private String name;

}
