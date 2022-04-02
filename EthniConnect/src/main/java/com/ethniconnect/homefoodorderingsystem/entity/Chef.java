package com.ethniconnect.homefoodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="chef_details")
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chef_id")
    private long chefId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "mobile_number",
            nullable = false)
    private String mobileNumber;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zipCode;

    @Column(name = "about_chef")
    private String aboutChef;

    @Column(name = "preferred_payment_type")
    private String preferredPaymentType;

    @Column(name = "image")
    private Byte[] image;

    @Column(name = "preferred_cuisine_id")
    private long preferredCuisineId;
}
