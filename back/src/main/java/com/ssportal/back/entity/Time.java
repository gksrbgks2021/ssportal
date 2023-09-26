package com.ssportal.back.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Table(name = "Time")
public class Time {

    @Id
    @Column(name = "t_code")
    private String timeCode;

    @Column(name = "t_time")
    private String tTime;
}
