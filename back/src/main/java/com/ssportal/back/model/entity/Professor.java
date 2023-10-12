package com.ssportal.back.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Professor")
public class Professor {

    @Id
    @Column(name = "p_code", nullable = false)
    private String Pcode;

    @Column(name = "p_id", length = 20, nullable = false)
    private String pId;

    @Column(name = "p_pw", length = 16, nullable = false)
    private String pPw;

    @Column(name = "p_name", length = 30, nullable = false)
    private String pName;

    @Column(name = "p_phone", length = 13)
    private String pPhone;

    @Column(name = "p_email", length = 30)
    private String pEmail;

    @Column(name = "d_code", length = 10)
    private String dCode;

}
