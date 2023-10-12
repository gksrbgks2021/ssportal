package com.ssportal.back.model.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Data
@Entity
@Table(name="Enrollment")
@NoArgsConstructor
@Getter
@Setter
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="e_code", nullable = false, length = 10)
    private int eCode;

    @Column(name="e_date")
    private Time eDate;

    @Column(name="s_code", length=10)
    private Student sCode;

    @Column(name="c_code", length=10)
    private Class cCode;
}
