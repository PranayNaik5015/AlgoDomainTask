package com.AlgoDomain.TechnicalTask.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product_details")
public class ProductMasterModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pid")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private Double price;

    @Column(name = "isActive")
    private String isActive = "Y";

    @JsonIgnore
    @JoinColumn(name = "id", referencedColumnName = "sid")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private SellerModel sellerModel;
}
