package com.ssportal.back.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Data
@Entity
@Table(name="Attendence")
@NoArgsConstructor
@Getter
@Setter
public class Attendence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_code", nullable = false, length = 10)
    private String aCode;

    @Column(name = "a_date", nullable = false)
    private Date aDate;

    @Column(name = "a_attendence", nullable = false, length = 10)
    private String aAttendence;

    @ManyToOne(fetch = FetchType.EAGER) // 여러 출결은 한 가지의 상태를 가진다.
    @Column(name = "s_code", length = 10)
    private Student sCode;

    @ManyToOne(fetch = FetchType.EAGER) // 여러 학생은 한 가지의 학과를 가진다 ??????
    @Column(name = "c_code", length = 10)
    private Class cCode;
}