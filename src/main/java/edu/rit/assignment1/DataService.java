package edu.rit.assignment1;

import model.Branch;
import model.Car;
import model.Member;
import model.MembershipApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    private List<Member> members = new ArrayList<>();
    private List<Branch> branches = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private List<MembershipApplication> applications = new ArrayList<>();

    public DataService() {
        Branch branch1 = new Branch("B001", "New York", "123 Main St", "John");
        Branch branch2 = new Branch("B002", "Los Angeles", "456 Oak Ave", "Jane");
        branches.add(branch1);
        branches.add(branch2);

    }
        public List<Branch> getAllBranches () {
            return branches;
        }


        public void addBranch (Branch branch){
            branches.add(branch);
        }
    }