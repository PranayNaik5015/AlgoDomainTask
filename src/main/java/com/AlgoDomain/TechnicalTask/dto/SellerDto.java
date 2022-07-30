package com.AlgoDomain.TechnicalTask.dto;

import com.AlgoDomain.TechnicalTask.model.ProductMasterModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SellerDto {

    private String name;

    private String gender;

    private String address;

    private Long contactNo;

    private String email;

    private String username;

    private String password;

    private ProductMasterModel product;

}
