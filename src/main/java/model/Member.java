package model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import model.Branch;

public class Member {
    private String memberid;
    private String membername;
    private String member_sponsor;


    public Member( String memberid, String membername, String member_sponsor) {
        this.memberid = memberid;
        this.membername = membername;
        this.member_sponsor = member_sponsor;

    }
    public Member(){

    }
        public String getMemberid () {
            return memberid;
        }

        public void setMemberid (String memberid){
            this.memberid = memberid;
        }

        public String getMembername () {
            return membername;
        }

        public void setMembername (String membername){
            this.membername = membername;
        }

        public String getMember_sponsor () {
            return member_sponsor;
        }

        public void setMember_sponsor (String member_sponsor){
            this.member_sponsor = member_sponsor;
        }


}