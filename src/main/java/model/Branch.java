package model;


import java.util.ArrayList;


public class Branch{
    private String branchID;
    private String city;
    private String address;
    private String branchManager;
    private ArrayList<Car> inventory= new ArrayList<>();
    private ArrayList<Member> homeMembers= new ArrayList<>();
    private ArrayList<Member> awayMembers= new ArrayList<>();

    public Branch(String branchID, String city, String address, String branchManager){
        this.branchID = branchID;
        this.city = city;
        this.address = address;
        this.branchManager = branchManager;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Car> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Member> getHomeMembers() {
        return homeMembers;
    }

    public void setHomeMembers(ArrayList<Member> homeMembers) {
        this.homeMembers = homeMembers;
    }

    public ArrayList<Member> getAwayMembers() {
        return awayMembers;
    }

    public void setAwayMembers(ArrayList<Member> awayMembers) {
        this.awayMembers = awayMembers;
    }
}
