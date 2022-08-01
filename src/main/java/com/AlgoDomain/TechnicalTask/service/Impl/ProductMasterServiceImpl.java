package com.AlgoDomain.TechnicalTask.service.Impl;

import com.AlgoDomain.TechnicalTask.dao.ProductMasterDao;
import com.AlgoDomain.TechnicalTask.dto.ProductMasterDto;
import com.AlgoDomain.TechnicalTask.dto.ProductResponseDto;
import com.AlgoDomain.TechnicalTask.model.ProductMasterModel;
import com.AlgoDomain.TechnicalTask.service.ProductMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMasterServiceImpl implements ProductMasterService {

    @Autowired
    private ProductMasterDao productMasterDao;
    @Override
    public Boolean insertProductDataService(ProductMasterDto productMasterDto) {

        ProductMasterModel productMasterModel = new ProductMasterModel();

        productMasterModel.setName(productMasterDto.getName());
        productMasterModel.setCategory(productMasterDto.getCategory());
        productMasterModel.setType(productMasterDto.getType());
        productMasterModel.setPrice(productMasterDto.getPrice());

        Boolean flag = productMasterDao.insertProductDataDao(productMasterModel);
        return flag;
    }

    @Override
    public List getInsertProductDataService() {

        List list = productMasterDao.getInsertProductDataDao();

        return list;
    }

    @Override
    public Boolean updateProductDataService(ProductMasterDto productMasterDto) {

        ProductMasterModel productMasterModel = new ProductMasterModel();

        productMasterModel.setId(productMasterDto.getId());
        productMasterModel.setName(productMasterDto.getName());
        productMasterModel.setCategory(productMasterDto.getCategory());
        productMasterModel.setType(productMasterDto.getType());
        productMasterModel.setPrice(productMasterDto.getPrice());

        Boolean flag = productMasterDao.updateProductDataDao(productMasterModel);
        return flag;
    }

    @Override
    public Boolean deleteProductDataByIdService(Integer id) {
        Boolean flag = productMasterDao.deleteProductDataByIdDao(id);
        return flag;
    }

    @Override
    public List<ProductMasterDto> productResponseService(ProductResponseDto productResponseDto) {

        List<ProductMasterDto> list = productMasterDao.ProductResponseDao(productResponseDto);

        return list;
    }

    @Override
    public Boolean productStatusByIdServce(Integer id) {
        Boolean flag = productMasterDao.productStatusByIdDao(id);
        return flag;
    }

    @Override
    public List<ProductMasterDto> searchProductResService(ProductResponseDto productResponseDto) {

        List<ProductMasterDto> list = productMasterDao.searchProductResDao(productResponseDto);

        return list;
    }

}
