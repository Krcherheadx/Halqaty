package com.halaqaty.halaqa_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "halaqa")
public class Halaqa {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "halaqa_name", nullable = false)
    private String halaqaName;
     
}
