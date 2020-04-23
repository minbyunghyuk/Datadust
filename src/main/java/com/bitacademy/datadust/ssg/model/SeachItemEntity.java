package com.bitacademy.datadust.ssg.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="tbl_ssg_0420")
public class SeachItemEntity  {

    @Id
    @GeneratedValue
    private Long Id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private String price;

    @Column(name = "unit")
    private String unit;
    @Column(name = "score")
    private String score;

    @Column(name = "comment")
    private String comment;

    @Column(name = "date")
    private Date date;



}
