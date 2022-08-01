package com.AlgoDomain.TechnicalTask.service;

import com.AlgoDomain.TechnicalTask.dto.ProductMasterDto;
import com.AlgoDomain.TechnicalTask.dto.ProductResponseDto;

import java.util.List;

public interface ProductMasterService {
    Boolean insertProductDataService(ProductMasterDto productMasterDto);

    List getInsertProductDataService();


    Boolean updateProductDataService(ProductMasterDto productMasterDto);

    Boolean deleteProductDataByIdService(Integer id);

    List<ProductMasterDto> productResponseService(ProductResponseDto productResponseDto);

    Boolean productStatusByIdServce(Integer id);

    List<ProductMasterDto> searchProductResService(ProductResponseDto productResponseDto);

}
