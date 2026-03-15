package model;


import java.util.ArrayList;
import java.util.List;


public class Member {
    private String memberid;
    private String membername;
    private String member_sponsor;
    private List<Car> usage_history =  new ArrayList<>();
    private Branch homeBranch;

    public Member( String memberid, String membername, String member_sponsor) {
        this.memberid = memberid;
        this.membername = membername;
        this.member_sponsor = member_sponsor;
    }

    public Member() {
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getMember_sponsor() {
        return member_sponsor;
    }

    public void setMember_sponsor(String member_sponsor) {
        this.member_sponsor = member_sponsor;
    }

    public List<Car> getUsage_history() {
        return usage_history;
    }

    public void setUsage_history(List<Car> usage_history) {
        this.usage_history = usage_history;
    }

    public Branch getHomeBranch() {
        return homeBranch;
    }

    public void setHomeBranch(Branch homeBranch) {
        this.homeBranch = homeBranch;
    }

}
