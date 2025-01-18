package com.example.publicHousing.domain.repository;

import com.example.publicHousing.domain.repository.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HousingRepository extends JpaRepository<House, Long> {

    Optional<House> findById(Long id);
    List<House> findAll();
}
