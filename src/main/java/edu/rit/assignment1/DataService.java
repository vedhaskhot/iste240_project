package edu.rit.assignment1;

import model.Branch;
import model.Member;
import org.springframework.stereotype.Service;
import Model.Branch;
import Model.Car;
import Model.Member;
import Model.MembershipApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    private List<Member> members = new ArrayList<>();
    private List<Branch> branches = new ArrayList<>();

    public DataService(){
        Branch london = new Branch("B001","London", "Winfrey Street", "Boris Johnson");

        Member alice = new Member("M001","Alice Hoverman","Bob Burker", london);
        Member kermit = new Member("M002","Kermit Toader","Bob Burker", london);

        members.add(alice);
        members.add(kermit);
    }

    public List<Member> getAllMembers() {
        return members;
    }

    public void addMembers(Member newMember) {
        members.add(newMember);
    }

    public List<Branch> getAllbranches() {
        return branches;
    }
}
