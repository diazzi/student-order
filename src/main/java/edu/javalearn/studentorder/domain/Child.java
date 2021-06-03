package edu.javalearn.studentorder.domain;

import java.time.LocalDate;

public class Child extends Person {
    private String certificateNumber;
    private LocalDate issueDate;
    private RegisterOffice issueDepartment;

    public Child(String surName, String givName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givName, patronymic, dateOfBirth);
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNubmber) {
        this.certificateNumber = certificateNubmber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public RegisterOffice getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(RegisterOffice issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    @Override
    public String toString() {
        return "Child{" +
                "certificateNubmber='" + certificateNumber + '\'' +
                ", issueDate=" + issueDate +
                ", issueDepartment='" + issueDepartment + '\'' +
                '}';
    }
}
