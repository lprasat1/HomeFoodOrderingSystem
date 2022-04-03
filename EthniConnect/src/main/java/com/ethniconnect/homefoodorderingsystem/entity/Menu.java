package com.ethniconnect.homefoodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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
    @Enumerated(EnumType.STRING)
    private Week week; // Sunday to Saturday
    @Enumerated(EnumType.STRING)
    private MenuType menuType;
    private Date preferredTimeSlot; //beyond that order cannot be cancelled
    private long chefId;
}
