package com.ssportal.back.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Dept")
@Data
public class Dept {
    @Id
    @Column(name = "d_code", length = 10)
    private String dCode;

    @Column(name = "d_name",length = 20)
    private String dName;
}
