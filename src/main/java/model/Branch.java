package model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

import java.util.ArrayList;


public class Branch{
    private String branchID;
    private String city;
    private String address;
    private String branchManager;

    public Branch(String branchID, String city, String address, String branchManager){
        this.branchID = branchID;
        this.city = city;
        this.address = address;
        this.branchManager = branchManager;
    }
    public Branch(){

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



}
