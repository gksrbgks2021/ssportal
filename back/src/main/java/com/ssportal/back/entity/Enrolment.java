package com.ssportal.back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "Enrolment")
public class Enrolment {

    @Id
    @Column(name = "e_code")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int enrolCode;

    @Column(name = "e_date")
    private Date enrolDate;

    @ManyToOne
    @JoinColumn(name = "s_code")
    private Student studCode;

    @ManyToOne
    @JoinColumn(name = "c_code")
    private Class classCode;
}
