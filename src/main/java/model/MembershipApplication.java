package model;

import org.springframework.stereotype.Component;

public class MembershipApplication {
    private String applicationId;
    private String applicantName;
    private Member sponsor;

    public MembershipApplication(String applicationId, String applicantName, Member sponsor) {
        this.applicationId = applicationId;
        this.applicantName = applicantName;
        this.sponsor = sponsor;
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

    public Member getSponsor() {
        return sponsor;
    }

    public void setSponsor(Member sponsor) {
        this.sponsor = sponsor;
    }
}
