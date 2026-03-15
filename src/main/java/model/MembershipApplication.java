package model;


public class MembershipApplication {
    private String applicationId;
    private String applicantName;
    private String sponsorMemberId;

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

}
