package com.AlgoDomain.TechnicalTask.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "seller_registration")
public class SellerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sid")
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

    @JsonIgnore
    @OneToMany(mappedBy = "sellerModel", fetch = FetchType.LAZY)
    private List<ProductMasterModel> productMasterModelList;
}
