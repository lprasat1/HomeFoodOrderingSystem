package com.ethniconnect.homefoodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menu_details")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double price;
    private String ingredients;
    private String interestingFacts;
    private byte[] image;
    private String day; // Sunday to Saturday
    private String menuType; // BF,Lunch,Dinner
    private long chefId;
}
