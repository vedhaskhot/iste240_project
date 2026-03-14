package model;


public class Car {


    private String brand;
    private String model;
    private int year;
    private double price;
    private Branch flagshipBranch;
    private Member member;
    private Branch branch;


    public Car() {
    }


    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Branch getFlagshipBranch() {
        return flagshipBranch;
    }

    public void setFlagshipBranch(Branch flagshipBranch) {
        this.flagshipBranch = flagshipBranch;
    }
}
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
