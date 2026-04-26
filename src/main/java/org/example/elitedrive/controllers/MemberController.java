package org.example.elitedrive.controllers;

//Mohammed Eshaan UID=418004114//

import org.example.elitedrive.entities.Member;
import org.example.elitedrive.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {
    @Autowired
    private MemberService memberServ;

    @GetMapping
    public List<Member> getAllMembers(){
        return memberServ.getAllMembers();
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable Long id){
        return memberServ.getMemberById(id).orElseThrow(()->new RuntimeException("Member does not exist!"));
    }

    @GetMapping("/search")
    public List<Member> getMemberByName(@RequestParam String memberName){
        return memberServ.searchByName(memberName);
    }

    @PostMapping
    public ResponseEntity<Member> createMember(@RequestBody Member newMember){
        memberServ.createMember(newMember);
        return ResponseEntity.ok(newMember);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable Long id,@RequestBody Member newData){
        memberServ.updateMemberById(id,newData);
        return ResponseEntity.ok(newData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long id){
        memberServ.deleteMember(id);
        return ResponseEntity.noContent().build();
    }
}
