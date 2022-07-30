package com.AlgoDomain.TechnicalTask.service.Impl;

import com.AlgoDomain.TechnicalTask.dao.SellerDao;
import com.AlgoDomain.TechnicalTask.dto.SellerDto;
import com.AlgoDomain.TechnicalTask.model.SellerModel;
import com.AlgoDomain.TechnicalTask.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerDao sellerDao;
    @Override
    public Boolean postSellerDataService(SellerDto sellerDto) {

        SellerModel sellerModel = new SellerModel();

        sellerModel.setName(sellerDto.getName());
        sellerModel.setGender(sellerDto.getGender());
        sellerModel.setAddress(sellerDto.getAddress());
        sellerModel.setContactNo(sellerDto.getContactNo());
        sellerModel.setEmail(sellerDto.getEmail());
        sellerModel.setUsername(sellerDto.getUsername());
        sellerModel.setPassword(sellerDto.getPassword());

        Boolean flag = sellerDao.postSellerDataDao(sellerModel);

        return flag;
    }
}
