package com.AlgoDomain.TechnicalTask.dao;

import com.AlgoDomain.TechnicalTask.dto.ProductMasterDto;
import com.AlgoDomain.TechnicalTask.dto.ProductResponseDto;
import com.AlgoDomain.TechnicalTask.model.ProductMasterModel;

import java.util.List;

public interface ProductMasterDao {
    Boolean insertProductDataDao(ProductMasterModel productMasterModel);

    List getInsertProductDataDao();

    Boolean updateProductDataDao(ProductMasterModel productMasterModel);

    Boolean deleteProductDataByIdDao(Integer id);

    List<ProductMasterDto> ProductResponseDao(ProductResponseDto productResponseDto);

    Boolean productStatusByIdDao(Integer id);

    List<ProductMasterDto> searchProductResDao(ProductResponseDto productResponseDto);

}
