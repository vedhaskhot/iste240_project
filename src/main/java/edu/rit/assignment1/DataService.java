package edu.rit.assignment1;

import model.Branch;
import model.Member;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    private List<Member> members = new ArrayList<>();

    public DataService(){

        Member alice = new Member("M001","Alice Hoverman","Bob Burker");
        Member kermit = new Member("M002","Kermit Toader","Bob Burker");

        members.add(alice);
        members.add(kermit);
    }

    public List<Member> getAllMembers() {
        return members;
    }

    public void addMembers(Member newMember) {
        members.add(newMember);
    }

}
