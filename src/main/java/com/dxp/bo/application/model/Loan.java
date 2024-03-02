package com.dxp.bo.application.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;
    private int loanID;
    private int applicationID;
    private BigDecimal loanAmount;
    private BigDecimal interestRate;
    private int termMonths;
    private Date disbursementDate;
    private Date repaymentStartDate;
    private Date repaymentEndDate;
    private BigDecimal monthlyInstallmentAmount;
    private Date startDate;
    private Date endDate;

    private transient Phase phase;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Phase> allPhases;

}
