package com.dxp.bo.application.repository;

import com.dxp.bo.application.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, String> {
}
