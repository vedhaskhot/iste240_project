package org.example.elitedrive.entities;

//Mohammed Eshaan UID:418004114//

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="members")
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long memberId;

    @Column(name="full_name")
    private String memberName;

    @Column(name="email_address")
    private String memberEmail;

    private String currentCar;

    private LocalDate joinDate;

    private String status;

    public Member(String memberName, String memberEmail, String currentCar, LocalDate joinDate, String status) {
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.currentCar = currentCar;
        this.joinDate = joinDate;
        this.status = status;
    }

    public Member() {
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getCurrentCar() {
        return currentCar;
    }

    public void setCurrentCar(String currentCar) {
        this.currentCar = currentCar;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}
