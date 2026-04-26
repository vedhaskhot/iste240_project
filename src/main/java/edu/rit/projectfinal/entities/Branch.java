package edu.rit.projectfinal.entities;



import jakarta.persistence.*;

@Entity
@Table(name="Branch")
public class Branch{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer branchID;
    @Column
    private String city;
    @Column
    private String address;
    @Column
    private String branchManager;

    public Branch(Integer branchID, String city, String address, String branchManager){
        this.branchID = branchID;
        this.city = city;
        this.address = address;
        this.branchManager = branchManager;
    }
    public Branch(){

    }

    public Integer getBranchID() {
        return branchID;
    }
    public void setBranchID(int branchID) {
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