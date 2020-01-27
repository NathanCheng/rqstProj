package com.visa.demospringboot.repository;

import com.visa.demospringboot.entity.CustomDimensionRequest;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomDimensionRequestDao extends JpaRepository<CustomDimensionRequest,Long> {
}
