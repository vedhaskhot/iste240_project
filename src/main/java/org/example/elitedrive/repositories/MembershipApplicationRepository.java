// By: Akhil Biju (752000700)
package org.example.elitedrive.repositories;

import org.example.elitedrive.entities.MembershipApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MembershipApplicationRepository extends JpaRepository<MembershipApplication, Long> {

    @Query("SELECT m FROM MembershipApplication m WHERE m.status = ?1")
    List<MembershipApplication> findByStatusCustom(String status);

    @Transactional
    @Modifying
    @Query("UPDATE MembershipApplication m SET m.status = ?2 WHERE m.id = ?1")
    void updateStatusById(Long id, String newStatus);
}