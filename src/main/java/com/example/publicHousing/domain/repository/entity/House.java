package com.example.publicHousing.domain.repository.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String type;
    @Column
    private String address;
    @Column
    private Double lat;
    @Column
    private Double lon;
    @Column
    private Long deposit;
    @Column
    private Long rent;
    @Column
    private Timestamp createdAt;
    @Column
    private Timestamp updatedAt;

}
