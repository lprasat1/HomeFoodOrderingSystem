package com.ethniconnect.homefoodorderingsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_details")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String orderStatus;

/*    @OneToMany
    private List<Menu> menu;

    @OneToOne
    private Customer customer;*/

}
