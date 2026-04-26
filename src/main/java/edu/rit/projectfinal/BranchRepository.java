package edu.rit.projectfinal;

import edu.rit.projectfinal.model.Branch;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer > {
    @Override
    List<Branch> findAll();

    @Override
   Branch save(Branch branch);

    List<Branch> findByBranchID(Integer branchID);
    
    List<Branch> findByCity( String city);
    List<Branch> findByAddress( String address);

    List<Branch> findByBranchManager(String branchManager);
 @Transactional
 @Modifying
 @Query("UPDATE Branch b SET b.city = :city, b.address = :address, b.branchManager = :manager WHERE b.branchID = :id")
 int updateBranchFull( Integer id,
                       String city,
                       String address,
                       String manager);
    void deleteByBranchID(Integer branchID);

    // Delete by city
    void deleteByCity(String city);

    // Delete by address
    void deleteByAddress(String address);

    // Delete by branchManager
    void deleteByBranchManager(String branchManager);




}
