package com.AlgoDomain.TechnicalTask.controller;

import com.AlgoDomain.TechnicalTask.dto.CustomerDto;
import com.AlgoDomain.TechnicalTask.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "postcustData")
    public Boolean insertCustDataCtrl(@RequestBody CustomerDto customerDto){

        Boolean flag = customerService.insertCustDataService(customerDto);

        if (flag == true){
            return flag;
        }
        else {
            return flag;
        }
    }
}
