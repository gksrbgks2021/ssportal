package com.ssportal.back.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Record")
public class Record {
    @Id
    @Column(name = "r_code", length = 10)
    private String rCode;

    @Column(name = "r_semester", length = 10)
    private String rSemester;

    @Column(name = "r_score")
    private long rScore;

    @Column(name = "r_grade",length = 5)
    private String rGrade;

    @Column(name="r_pnp")
    private boolean rPnp;

    @ManyToOne(fetch = FetchType.EAGER) // 여러 출결은 한 가지의 상태를 가진다.
    @Column(name = "s_code", length = 10)
    private Student sCode;

    @ManyToOne(fetch = FetchType.EAGER) // 여러 학생은 한 가지의 학과를 가진다 ??????
    @Column(name = "c_code", length = 10)
    private Class cCode;
}
