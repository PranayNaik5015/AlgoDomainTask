package com.AlgoDomain.TechnicalTask.controller;

import com.AlgoDomain.TechnicalTask.dto.SellerDto;
import com.AlgoDomain.TechnicalTask.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class SellerController {

    @Autowired
    private SellerService sellerService;

//    Posting Seller's Data

    @PostMapping(value = "postSellerData")

    public Boolean postSellerDataController(@RequestBody SellerDto sellerDto){

        Boolean flag = sellerService.postSellerDataService(sellerDto);

        if (flag == true){
            return flag;
        }
        else {
            return flag;
        }
    }
}
