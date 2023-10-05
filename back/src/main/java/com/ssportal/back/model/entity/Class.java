package com.ssportal.back.model.entity;


import com.ssportal.back.model.entity.enums.Ctype;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Data
@Entity
@Table(name="class")
@NoArgsConstructor
@Getter
@Setter
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="c_code", nullable = false, length = 10)
    private String cCode;

    @Column(name="c_name",nullable = false, length = 30)
    private String cName;

    @Column(name="c_classroom", nullable = false, length = 30)
    private String cClassroom;

    @Column(name="c_grade", nullable = false)
    private int cGrade;

    @Column(name="c_maxstudent", nullable = false)
    private long cMaxstudent;

    @Column(name="c_type", columnDefinition = "TINYINT DEFAULT 0")
    @Enumerated(EnumType.ORDINAL)
    private Ctype cType = Ctype.MINOR;

    @ManyToOne(fetch = FetchType.LAZY) // 여러 강의는 한 명의 교수를 가진다.
    @JoinColumn(name="p_code")
    private String pCode;//객체를 담아야함.

    @ManyToOne(fetch= FetchType.LAZY)
    @Column(name="t_code",length=10)
    private String tCode;//객체를 담아야함
}
