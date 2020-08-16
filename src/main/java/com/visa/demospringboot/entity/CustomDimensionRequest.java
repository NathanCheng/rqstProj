package com.visa.demospringboot.entity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "request_table")
public class CustomDimensionRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "request_id")
    private Long id;

    @Column(name = "request_name")
    private String name;

    @Column(name = "request_type")
    private String type;

    @Column(name = "request_partner")
    private String partner;

    @Column(name = "request_content")
    private String content;




}
