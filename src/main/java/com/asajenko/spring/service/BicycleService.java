package com.asajenko.spring.service;

import com.asajenko.spring.config.BicycleConfig;
import com.asajenko.spring.model.Bicycle;
import com.asajenko.spring.repository.BicycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BicycleService {

    @Autowired
    private BicycleRepository repository;
    private BicycleConfig config;

    @Autowired
    public void setConfig(BicycleConfig config) {
        this.config = config;
    }

    public List<String> getBicycleModels() {
        return repository.getAllBicycle().stream().map(Bicycle::getModel).collect(Collectors.toList());
    }

    public void bicycleConfigSize() {
        config.configSize();
    }


}
