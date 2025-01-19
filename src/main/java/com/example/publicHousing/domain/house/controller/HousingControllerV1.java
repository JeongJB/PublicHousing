package com.example.publicHousing.domain.house.controller;

import com.example.publicHousing.domain.house.model.HousingInfo;
import com.example.publicHousing.domain.house.model.response.HousingInfoResponse;
import com.example.publicHousing.domain.house.service.HousingServiceV1;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "House API")
@RestController
@RequestMapping("/houses")
@RequiredArgsConstructor
public class HousingControllerV1 {

    private final HousingServiceV1 housingServiceV1;

    @GetMapping
    public List<HousingInfo> houseList() {
        return housingServiceV1.houseList();
    }

    @GetMapping("/{id}")
    public HousingInfoResponse houseInfo(@PathVariable("id") Long id) {
        return housingServiceV1.houseInfo(id);
    }

}
