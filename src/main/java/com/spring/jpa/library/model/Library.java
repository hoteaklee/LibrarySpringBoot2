package com.spring.jpa.library.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "library")
public class Library {
    @Id
    private Long lbno;
    private String lbname;
    private String sido;
    private String gugun;
    private String lbtype;
    private String clsday;
    private String addr;
    private String phone;
    private String homepage;
    private Double lat;
    private Double lon;
    private Date regdate;



}
