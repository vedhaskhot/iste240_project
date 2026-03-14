package edu.rit.assignment1;

import model.Car;
import Model.Branch;
import Model.Car;
import Model.Member;
import Model.MembershipApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
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
