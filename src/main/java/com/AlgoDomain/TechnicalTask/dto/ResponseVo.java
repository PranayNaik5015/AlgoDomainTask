package com.AlgoDomain.TechnicalTask.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseVo<T> {

    private String statusCode;

    private  String message;

    private T result;
}
