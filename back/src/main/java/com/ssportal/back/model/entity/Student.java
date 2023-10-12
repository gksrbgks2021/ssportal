package com.ssportal.back.model.entity;

import java.sql.Date;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name="Student")
@NoArgsConstructor
@Getter
@Setter

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="s_code", nullable = false, length = 10)
    private String sCode;

    @Column(name = "s_id", nullable = false, length = 20, unique = true) // c_id 를 고유(unique)하게 처리
    private String sId;

    @Column(name = "s_pw", nullable = false, length = 16)
    private String sPw;

    @Column(name = "s_name", nullable = false, length = 100)
    private String sName;

    @Column(name = "s_phone", length = 13)
    private String sPhone;

    @Column(name = "s_addr", length = 100)
    private String sAddr;

    @Column(name = "s_email", length = 30, unique = true) // c_email 을 고유(unique)하게 처리
    private String sEmail;

    // regDate MySQL에서는 Date 를 타입을 java 에서 받을때 java.sql.Date로 받는다는데
    // @Column(name = "s_regdate", nullable = false)
    // private Date sId;
    @Column(name = "s_regdate", nullable = false)
    private Date sRegDate; // import java.sql.Date; 를 위에 적어버렸

    @Column(name = "s_statue", nullable = false, length = 10)
    private String sStatus;

    @ManyToOne(fetch = FetchType.EAGER) // 여러 학생은 한 가지의 상태를 가진다.
    @Column(name = "p_code", length = 10)
    private String pCode;

    @ManyToOne(fetch = FetchType.EAGER) // 여러 학생은 한 가지의 학과를 가진다 ??????
    @Column(name = "d_code", length = 10)
    private String dCode;
}
