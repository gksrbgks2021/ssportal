package com.ssportal.back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "Record")
public class Record {

    @Id
    @Column(name = "r_code", length = 10)
    private String recCode;

    @Column(name = "r_semester", length = 10)
    private String recSemester;

    @Column(name = "r_score")
    private String recScore;

    @Column(name = "r_grade", length = 5)
    private String recGrade;

    @Column(name = "r_pnp", columnDefinition = "BIT DEFAULT b'0'")
    private Boolean recPnp;

    @ManyToOne
    @JoinColumn(name = "c_code")
    private Class classCode;

    @ManyToOne
    @JoinColumn(name = "s_code")
    private Student studCode;
}
