package com.example.publicHousing.domain.house.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HousingInfo {
    private Long id;
    private String type;
    private Double lat;
    private Double lon;
    private Long deposit;
    private Long rent;
}
