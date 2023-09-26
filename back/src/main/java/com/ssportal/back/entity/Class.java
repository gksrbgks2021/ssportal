package com.ssportal.back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "Class")
public class Class {

    @Id
    @Column(name = "c_code", length = 10)
    private String classCode;

    @Column(name = "c_name", length = 30)
    private String className;

    @Column(name = "c_classroom", length = 30)
    private String classRoom;

    @Column(name = "c_grade")
    private int classgrade;

    @Column(name = "c_maxstudent")
    private int classMaxStudent;

    @Column(name = "c_isMajor")
    private boolean classIsMajor;

    @ManyToOne
    @JoinColumn(name = "p_code")
    private Professor profCode;

    @ManyToOne
    @JoinColumn(name = "t_code")
    private Time timeCode;
}
