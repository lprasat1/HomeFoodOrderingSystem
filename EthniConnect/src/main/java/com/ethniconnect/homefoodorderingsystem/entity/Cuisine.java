package com.ethniconnect.homefoodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cuisine_master")
public class Cuisine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cuisine_id")
    private long id;

    @Column(name="cuisine_name")
    private String cuisineName;

    @Column(name="image")
    private byte[] image;
}
