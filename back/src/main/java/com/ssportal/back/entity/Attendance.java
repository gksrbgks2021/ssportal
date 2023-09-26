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
@Table(name = "Attendance")
public class Attendance {

    @Id
    @Column(name = "a_code", length = 10)
    private String atteCode;

    @Column(name = "a_date")
    private Date atteDate;

    @ManyToOne
    @JoinColumn(name = "s_code")
    private Student studCode;

    @ManyToOne
    @JoinColumn(name = "c_code")
    private Class classCode;
}
