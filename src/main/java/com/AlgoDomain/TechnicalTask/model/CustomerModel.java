package com.AlgoDomain.TechnicalTask.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "customer_registration")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "address")
    private String address;

    @Column(name = "contactNo")
    private Long contactNo;

    @Column(name = "email")
    private String email;

    @Column(name = "userName")
    private String username;

    @Column(name = "password")
    private String password;
}
