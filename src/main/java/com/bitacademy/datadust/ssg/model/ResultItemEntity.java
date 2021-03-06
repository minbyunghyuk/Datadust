package com.bitacademy.datadust.ssg.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@Table(name="tbl_result")
public class ResultItemEntity {

    @javax.persistence.Id
    @GeneratedValue
    private Long Id;

    @Column(name="date")
    private String date;

    @Column(name="potato_price")
    private String potato_price;

    @Column(name = "Exchange_Rate")
    private String Exchange_Rate;

    @Column(name = "KOSPI")
    private String KOSPI;

    @Column(name = "Dubai")
    private String Dubai;

    @Column(name = "Brent")
    private String Brent;

    @Column(name = "WTI")
    private String WTI;

    @Column(name = "Market_rates")
    private String Market_rates;
}
