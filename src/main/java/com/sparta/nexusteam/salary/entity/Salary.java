package com.sparta.nexusteam.salary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "salary")
@Getter
@Setter
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_id", nullable = false)
    private Long employeeId;

    @Column(name = "pay_date", nullable = false)
    private LocalDateTime payDate;

    @Column(name = "basic_salary", nullable = false, precision = 10, scale = 2)
    private BigDecimal basicSalary;

    @Column(name = "fixed_overtime_allowance", precision = 10, scale = 2)
    private BigDecimal fixedOvertimeAllowance;

    @Column(name = "meal_expense", precision = 10, scale = 2)
    private BigDecimal mealExpense;

    @Column(name = "income_tax", precision = 10, scale = 2)
    private BigDecimal incomeTax;

    @Column(name = "local_income_tax", precision = 10, scale = 2)
    private BigDecimal localIncomeTax;

    @Column(name = "national_pension", precision = 10, scale = 2)
    private BigDecimal nationalPension;

    @Column(name = "health_insurance", precision = 10, scale = 2)
    private BigDecimal healthInsurance;

    @Column(name = "long_term_care_insurance", precision = 10, scale = 2)
    private BigDecimal longTermCareInsurance;

    @Column(name = "employment_insurance", precision = 10, scale = 2)
    private BigDecimal employmentInsurance;
}