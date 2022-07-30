package com.AlgoDomain.TechnicalTask.service.Impl;

import com.AlgoDomain.TechnicalTask.dao.CustomerDao;
import com.AlgoDomain.TechnicalTask.dto.CustomerDto;
import com.AlgoDomain.TechnicalTask.model.CustomerModel;
import com.AlgoDomain.TechnicalTask.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;
    @Override
    public Boolean insertCustDataService(CustomerDto customerDto) {

        CustomerModel  customerModel = new CustomerModel();

        customerModel.setName(customerDto.getName());
        customerModel.setGender(customerDto.getGender());
        customerModel.setAddress(customerDto.getAddress());
        customerModel.setContactNo(customerDto.getContactNo());
        customerModel.setEmail(customerDto.getEmail());
        customerModel.setUsername(customerDto.getUsername());
        customerModel.setPassword(customerDto.getPassword());

        Boolean flag = customerDao.insertCustDataService(customerModel);
        return flag;
    }
}
