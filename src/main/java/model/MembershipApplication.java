package model;

import org.springframework.stereotype.Component;


public class MembershipApplication {
    private String applicationId;
    private String applicantName;
    private String sponsorMemberId;
    private Member applicant;
    private Member sponsor;
    private Branch preferredBranch;
    private String status;

    public MembershipApplication(String applicationId, String applicantName, String sponsorMemberId) {
        this.applicationId = applicationId;
        this.applicantName = applicantName;
        this.sponsorMemberId = sponsorMemberId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getSponsorMemberId() {
        return sponsorMemberId;
    }

    public void setSponsorMemberId(String sponsorMemberId) {
        this.sponsorMemberId = sponsorMemberId;
    }

    public Member getApplicant() {
        return applicant;
    }

    public void setApplicant(Member applicant) {
        this.applicant = applicant;
    }

    public Member getSponsor() {
        return sponsor;
    }

    public void setSponsor(Member sponsor) {
        this.sponsor = sponsor;
    }

    public Branch getPreferredBranch() {
        return preferredBranch;
    }

    public void setPreferredBranch(Branch preferredBranch) {
        this.preferredBranch = preferredBranch;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
