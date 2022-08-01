package com.AlgoDomain.TechnicalTask.controller;

import com.AlgoDomain.TechnicalTask.dto.*;
import com.AlgoDomain.TechnicalTask.service.ProductMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductMasterController {

    @Autowired
    private ProductMasterService productMasterService;

// For Posting product data

    @PostMapping(value = "postProductData")

    public Boolean insertProductData(@RequestBody ProductMasterDto productMasterDto) {

        Boolean flag = productMasterService.insertProductDataService(productMasterDto);

        if (flag == true) {
            return flag;
        } else {
            return flag;
        }
    }

//    For Getting product data

    @GetMapping(value = "getProductData")

    public ResponseVo<List> getProductDataCtrl() {

        ResponseVo<List> responseVo = new ResponseVo<>();

        List list = productMasterService.getInsertProductDataService();

        if (list.size() != 0) {
            responseVo.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVo.setMessage("Data Found!!");
            responseVo.setResult(list);
        } else {
            responseVo.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            responseVo.setMessage("Data Not Found!!");
        }
        return responseVo;
    }

//    Updating product data

    @PutMapping(value = "updateProductDetails")
    public ResponseVo<Boolean> updateProductDataCtrl(@RequestBody ProductMasterDto productMasterDto) {
        ResponseVo<Boolean> responseVo = new ResponseVo<>();

        Boolean flag = productMasterService.updateProductDataService(productMasterDto);

        if (flag) {
            responseVo.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVo.setMessage("Data Found!!");
            responseVo.setResult(flag);
        } else {
            responseVo.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            responseVo.setMessage("Data Not Found!!");
        }
        return responseVo;
    }

//    Deleting Product Data

    @GetMapping(value = "deleteProductDataById/{id}")

    public ResponseVo<Boolean> deleteProductDataByIdCtrl(@PathVariable Integer id) {

        ResponseVo<Boolean> responseVo = new ResponseVo<>();

        Boolean flag = productMasterService.deleteProductDataByIdService(id);

        if (flag) {
            responseVo.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVo.setMessage("Data Found!!");
            responseVo.setResult(flag);
        } else {
            responseVo.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            responseVo.setMessage("Data Not Found!!");
        }
        return responseVo;
    }

//    Getting product details as per search

    @PostMapping(value = "productResponse")

    public ResponseVo<List> productResponseCtrl(@RequestBody ProductResponseDto productResponseDto) {

        ResponseVo<List> responseVo = new ResponseVo<>();

        List<ProductMasterDto> list = productMasterService.productResponseService(productResponseDto);

        if (list.size() != 0) {
            responseVo.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVo.setMessage("Data Found!!");
            responseVo.setResult(list);
        } else {
            responseVo.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            responseVo.setMessage("Data Not Found!!");
        }
        return responseVo;
    }

//    Changing product status to "N"

    @GetMapping(value = "productStatusById/{id}")
    public ResponseVo<Boolean> productStatusByIdCtrl(@PathVariable Integer id)
    {
        ResponseVo<Boolean> responseVO = new ResponseVo<>();
        Boolean flag = productMasterService.productStatusByIdServce(id);

        if(flag)
        {
            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVO.setMessage("Data Found!!");
            responseVO.setResult(flag);
        }
        else
        {
            responseVO.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            responseVO.setMessage("Data Not Found!!");
        }
        return responseVO;
    }

//    search product using single field

    @PostMapping(value = "searchProductBySingleField")

    public ResponseVo<List> searchProductBySingleField(@RequestBody ProductResponseDto productResponseDto) {

        ResponseVo<List> responseVo = new ResponseVo<>();

        List<ProductMasterDto> list = productMasterService.searchProductResService(productResponseDto);

        if (list.size() != 0) {
            responseVo.setStatusCode(String.valueOf(HttpStatus.OK));
            responseVo.setMessage("Data Found!!");
            responseVo.setResult(list);
        } else {
            responseVo.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            responseVo.setMessage("Data Not Found!!");
        }
        return responseVo;
    }
}
