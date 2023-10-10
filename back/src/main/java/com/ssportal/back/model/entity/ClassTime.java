package com.ssportal.back.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name="ClassTime")
@NoArgsConstructor
@Getter
@Setter
public class ClassTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="t_code", nullable = false, length = 10)
    private String tCode;

    @Column(name="t_time",nullable = false, length = 30)
    private String tTime;
}
