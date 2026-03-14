package edu.rit.assignment1;

import Model.Branch;
import Model.Member;
import Model.MembershipApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    private List<MembershipApplication> applications = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public DataService(){
        Branch amsterdam = new Branch ("B008", "Amsterdam", "Conrwallis", "Arjen Robben");
        Member steph = new Member("M010","Steph Johnson", "Lydia Hern", amsterdam);
        MembershipApplication app1 = new MembershipApplication("AP1000","Morris Kernal", steph);
        MembershipApplication app2 = new MembershipApplication("AP1001","Ben Davis", steph);
        applications.add(app1);
        applications.add(app2);
    }

    public List<MembershipApplication> getAllApplications() {
        return applications;
    }

    public void addApplication(MembershipApplication newApplication) {

        applications.add(newApplication);
    }
    public List<Member> getAllMembers(){
        return members;
    }
}