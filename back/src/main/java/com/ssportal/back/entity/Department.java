package com.ssportal.back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "Dept")
public class Department {

    @Id
    @Column(name = "d_code", length = 10)
    private String code;

    @Column(name = "d_name", length = 20)
    private String name;


}
