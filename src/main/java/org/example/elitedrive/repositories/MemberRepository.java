package org.example.elitedrive.repositories;

//Mohammed Eshaan, UID:418004114//

import org.example.elitedrive.entities.Member;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long>{

    @Query("SELECT m FROM Member m WHERE m.memberName LIKE %:fullName%")
    List<Member> findByMemberName(String fullName);

    Optional<Member> findByCurrentCar(String currentCar);

    @Query(value="SELECT * from members WHERE current_car=:currentCar AND status='inactive'", nativeQuery = true)
    List<Member> findInactiveMember(@Param("currentCar") String currentCar);

    @Modifying
    @Transactional
    @Query(value="UPDATE members SET current_car=:newCar WHERE member_id=:id", nativeQuery = true)
    int updateCarById(@Param("newCar") String newCar, @Param("id") Long memberId);
}
