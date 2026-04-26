// Author: Mohammed Saneeh - 421005948
package org.example.elitedrive.repositories;

import org.example.elitedrive.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    List<Car> findByBrand(String brand);

    List<Car> findByAvailable(boolean available);

    @Query("SELECT c FROM Car c WHERE LOWER(c.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
            "OR LOWER(c.model) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Car> searchByKeyword(@Param("keyword") String keyword);

    @Modifying
    @Transactional
    @Query("UPDATE Car c SET c.available = :available WHERE c.id = :id")
    void updateAvailabilityById(@Param("id") Long id, @Param("available") boolean available);
}
