package com.example.publicHousing.domain.repository;

import com.example.publicHousing.domain.repository.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingRepository extends JpaRepository<House, Long> {

}
