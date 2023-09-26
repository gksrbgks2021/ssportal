package com.ssportal.back.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "s_code", length = 10)
    private String studCode;

    @Column(name = "s_id", unique = true, length = 20)
    private String studId;

    @Column(name = "s_pw", length = 16)
    private String studPwd;

    @Column(name = "s_name", length = 100)
    private String studName;

    @Column(name = "s_phone", length = 13)
    private String studPhone;

    @Column(name = "s_addr", length = 100)
    private String studAddr;

    @Column(name = "s_email", unique = true, length = 30)
    private String studEmail;

    @Column(name = "s_regdate")
    private Date studRegDate;

    @Column(name = "s_status", length = 10)
    private String studStatus;

    @ManyToOne
    @JoinColumn(name = "p_code")
    private Professor profCode;

    @ManyToOne
    @JoinColumn(name = "d_code")
    private Department deptCode;
}
