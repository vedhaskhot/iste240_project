package edu.rit.assignment1;

import Model.Branch;
import model.Car;
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
    private List<Car> cars = new ArrayList<>();

    public DataService(){
        Car AMDB12 = new Car("Aston Martin","DB 12",2022,300000);
        Car P911GT = new Car("Porsche","911 GT3",2023,300000);
        cars.add(AMDB12);
        cars.add(P911GT);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public void addCars(Car newCar) {

        cars.add(newCar);
    }
}
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
