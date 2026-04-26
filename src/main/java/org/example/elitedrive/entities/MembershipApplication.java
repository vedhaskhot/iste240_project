// By: Akhil Biju (752000700)
package org.example.elitedrive.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "membership_applications")
public class MembershipApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String applicantName;
    private String email;
    private String licenseNumber;
    private String status;
    private LocalDate submissionDate;

    public MembershipApplication() {
        this.submissionDate = LocalDate.now();
        this.status = "PENDING";
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getApplicantName() { return applicantName; }
    public void setApplicantName(String applicantName) { this.applicantName = applicantName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDate getSubmissionDate() { return submissionDate; }
    public void setSubmissionDate(LocalDate submissionDate) { this.submissionDate = submissionDate; }

}