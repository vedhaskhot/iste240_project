package edu.rit.assignment1;

import model.Branch;
import model.Member;
import org.springframework.stereotype.Service;

import model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {
    private List<Car> cars = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public DataService() {
        Car AMDB12 = new Car("Aston Martin", "DB 12", 2022, 300000);
        Car P911GT = new Car("Porsche", "911 GT3", 2023, 300000);
        cars.add(AMDB12);
        cars.add(P911GT);

        Member alice = new Member("M001","Alice Hoverman","Bob Burker");
        Member kermit = new Member("M002","Kermit Toader","Bob Burker");

        members.add(alice);
        members.add(kermit);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public void addCars(Car newCar) {

        cars.add(newCar);
    }

    public List<Member> getAllMembers() {
        return members;
    }

    public void addMembers(Member newMember) {
        members.add(newMember);
    }
}
