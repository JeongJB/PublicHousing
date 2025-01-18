package com.example.publicHousing.domain.house.service;

import com.example.publicHousing.domain.repository.HousingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HousingServiceV1 {
    private final HousingRepository housingRepository;


}
