package com.visa.demospringboot.controller;

import com.visa.demospringboot.entity.CustomDimensionRequest;
import com.visa.demospringboot.service.CustomDimensionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customDimension")
public class RequestController {

    @Autowired
    CustomDimensionRequestService customDimensionRequestService;

    @GetMapping("/getAll")
    public List<CustomDimensionRequest> getAll() {
        List<CustomDimensionRequest> list = customDimensionRequestService.getAllCustomDimensionRequest();
        return list;
    }
}
