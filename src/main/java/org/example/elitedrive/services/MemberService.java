package org.example.elitedrive.services;

//Mohammed Eshaan UID:418004114//

import org.example.elitedrive.entities.Member;
import org.example.elitedrive.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRep;

    public List<Member> getAllMembers(){
        return memberRep.findAll();
    }

    public Optional<Member> getMemberById(Long id){
        return memberRep.findById(id);
    }

    public List<Member> searchByName(String memberName){
        return memberRep.findByMemberName(memberName);
    }

    public void createMember(Member member){
        memberRep.save(member);
    }

    public void updateMemberById(Long id, Member newData){
        Member update=memberRep.findById(id).orElseThrow(()->new RuntimeException("Member Not Found!\nMake sure you have entered the correct ID."));
        update.setMemberName(newData.getMemberName());
        update.setMemberEmail(newData.getMemberEmail());
        update.setCurrentCar(newData.getCurrentCar());
        update.setStatus(newData.getStatus());
        update.setJoinDate(newData.getJoinDate());
        memberRep.save(update);
    }

    public void deleteMember(Long id){
        memberRep.deleteById(id);
    }
}
