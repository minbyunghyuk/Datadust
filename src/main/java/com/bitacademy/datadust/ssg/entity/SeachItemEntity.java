package com.bitacademy.datadust.ssg.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="tbl_ssg_0420")
public class SeachItemEntity  {

    @Id
//    @GeneratedValue
    private Long idx;

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


    @Override
    public String toString() {
        return "SeachItemEntity{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", unit='" + unit + '\'' +
                ", score='" + score + '\'' +
                ", comment='" + comment + '\'' +
                ", date=" + date +
                '}';
    }
}
