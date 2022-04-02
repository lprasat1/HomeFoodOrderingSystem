package com.ethniconnect.homefoodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="zip_master")
public class Zip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zip_id")
    private long id;

    @Column(name = "zip_code")
    private String zipCode;

}
