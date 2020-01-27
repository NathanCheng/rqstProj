package com.visa.demospringboot.service;

import com.visa.demospringboot.entity.CustomDimensionRequest;
import com.visa.demospringboot.repository.CustomDimensionRequestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomDimensionRequestService {

    @Autowired
    private CustomDimensionRequestDao cdrDao;

    public List<CustomDimensionRequest> getAllCustomDimensionRequest() {
        List<CustomDimensionRequest> customDimensionRequests = cdrDao.findAll();
        return customDimensionRequests;
    }
}
