package com.AlgoDomain.TechnicalTask.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductMasterDto {

    private Integer id;

    private String name;

    private String type;

    private String category;

    private Double price;

    private String isActive;
}
