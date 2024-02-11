package com.dxp.bo.application.batch.directdebit.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class GroupHeader {

    @XmlElement(name = "MsgId")
    private String messageId;

    @XmlElement(name = "CreDtTm")
    private String creationDateTime;

    @XmlElement(name = "NbOfTxs")
    private int numberOfTransactions;

    @XmlElement(name = "CtrlSum")
    private String controlSum;

    @XmlElement(name = "InitgPty")
    private InitiatingParty initiatingParty;

}
