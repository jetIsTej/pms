package com.project.pms.entity;


import java.math.BigInteger;
import java.util.Set;
import java.util.UUID;

import com.datastax.driver.core.DataType;
import com.datastax.driver.core.LocalDate;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "employee")
public class Employee {
    @PrimaryKey("emp_uuid")
    private UUID employeeUUID;
    @Column("cpny_emp_id")
    private Integer companyEmployeeId;
    @Column("emp_first_name")
    private String empFirstName;
    @Column("emp_middle_name")
    private String empMiddleName;
    @Column("emp_last_name")
    private String empLastName;
    @Column("emp_phone")
    private BigInteger empPhoneNumber;
    @Column("emp_email")
    private String emailId;
    @Column("emp_tot_experience")
    private Short totalExperience;
    @Column("emp_rel_experience")
    private Short relevantExperience;
    @Column("emp_hire_date")
    private LocalDate hireDate;
    @Column("emp_designation")
    private String employeeDesignation;
    @Column("emp_tech_skills")
    @CassandraType(type = DataType.Name.SET, typeArguments = DataType.Name.VARINT)
    private Set<String> technicalSkills;
    @Column("emp_proj_acc_boarded")
    private boolean projectAccountBoarded;
    @Column("emp_proj_acc_board_date")
    private LocalDate projectAccountBoardingDate;
    @Column("emp_curr_proj_app_id")
    private Integer currentProjectApplicationId;
    @Column("emp_curr_proj_app_billable")
    private boolean currentProjectApplicationBillable;

    public UUID getEmployeeUUID() {
        return employeeUUID;
    }

    public void setEmployeeUUID(UUID employeeUUID) {
        this.employeeUUID = employeeUUID;
    }

    public Integer getCompanyEmployeeId() {
        return companyEmployeeId;
    }

    public void setCompanyEmployeeId(Integer companyEmployeeId) {
        this.companyEmployeeId = companyEmployeeId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpMiddleName() {
        return empMiddleName;
    }

    public void setEmpMiddleName(String empMiddleName) {
        this.empMiddleName = empMiddleName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public BigInteger getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public void setEmpPhoneNumber(BigInteger empPhoneNumber) {
        this.empPhoneNumber = empPhoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Short getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(Short totalExperience) {
        this.totalExperience = totalExperience;
    }

    public Short getRelevantExperience() {
        return relevantExperience;
    }

    public void setRelevantExperience(Short relevantExperience) {
        this.relevantExperience = relevantExperience;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public Set<String> getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(Set<String> technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public boolean isProjectAccountBoarded() {
        return projectAccountBoarded;
    }

    public void setProjectAccountBoarded(boolean projectAccountBoarded) {
        this.projectAccountBoarded = projectAccountBoarded;
    }

    public LocalDate getProjectAccountBoardingDate() {
        return projectAccountBoardingDate;
    }

    public void setProjectAccountBoardingDate(LocalDate projectAccountBoardingDate) {
        this.projectAccountBoardingDate = projectAccountBoardingDate;
    }

    public Integer getCurrentProjectApplicationId() {
        return currentProjectApplicationId;
    }

    public void setCurrentProjectApplicationId(Integer currentProjectApplicationId) {
        this.currentProjectApplicationId = currentProjectApplicationId;
    }

    public boolean isCurrentProjectApplicationBillable() {
        return currentProjectApplicationBillable;
    }

    public void setCurrentProjectApplicationBillable(boolean currentProjectApplicationBillable) {
        this.currentProjectApplicationBillable = currentProjectApplicationBillable;
    }
}
