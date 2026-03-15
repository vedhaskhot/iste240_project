package edu.rit.assignment1;

import model.MembershipApplication;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    private List<MembershipApplication> applications= new ArrayList<>();

    public DataService() {

        applications.add(new MembershipApplication("AP1000", "Morris Kernal", "M001"));
        applications.add(new MembershipApplication("AP1001", "Ben Davis", "M002"));
        applications.add(new MembershipApplication("AP1002", "John Sparks", "M003"));
    }


    public List<MembershipApplication> getAllApplications() {
        return applications;
    }

    public void addApplication(MembershipApplication application) {
        applications.add(application);
    }
}