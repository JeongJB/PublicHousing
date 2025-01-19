package com.example.publicHousing.domain.house.service;

import com.example.publicHousing.common.exception.CustomException;
import com.example.publicHousing.common.exception.ResultCode;
import com.example.publicHousing.domain.house.model.HousingInfo;
import com.example.publicHousing.domain.house.model.response.HousingInfoResponse;
import com.example.publicHousing.domain.repository.HousingRepository;
import com.example.publicHousing.domain.repository.entity.House;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class HousingServiceV1 {
    private final HousingRepository housingRepository;

    public List<HousingInfo> houseList() {
        List<House> houses = housingRepository.findAll();

        return houses.stream()
                .map(house -> new HousingInfo(house.getId(), house.getType(), house.getLat(), house.getLon(), house.getDeposit(), house.getRent()))
                .collect(Collectors.toList());
    }

    public HousingInfoResponse houseInfo(Long id) {
        Optional<House> house = housingRepository.findById(id);

        if (house.isEmpty()) {
            throw new CustomException(ResultCode.HOUSE_IS_INVALID);
        }

        HousingInfo housingInfo = new HousingInfo(
                house.get().getId(),
                house.get().getType(),
                house.get().getLat(),
                house.get().getLon(),
                house.get().getDeposit(),
                house.get().getRent());

        return new HousingInfoResponse(ResultCode.SUCCESS, housingInfo);
    }
}
