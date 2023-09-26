package com.ssportal.back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "Professor")
public class Professor {

    @Id
    @Column(name = "p_code", length = 10)
    private String profCode;

    @Column(name = "p_id", unique = true, length = 20)
    private String profId;

    @Column(name = "p_pw", length = 16)
    private String profPwd;

    @Column(name = "p_name", length = 100)
    private String profName;

    @Column(name = "p_phone", length = 13)
    private String profPhone;

    @Column(name = "p_email", unique = true, length = 30)
    private String profEmail;

    @ManyToOne
    @JoinColumn(name = "d_code")
    private Department deptCode;
}
