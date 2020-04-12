package com.asajenko.spring.repository;

import com.asajenko.spring.config.BicycleConfig;
import com.asajenko.spring.model.Bicycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class BicycleRepository {

    private final Bicycle cannodnaleFsi;
    private final Bicycle cannodnaleScalpel;
    private final Bicycle cannondaleFsi2;

    @Autowired
    public BicycleRepository(Bicycle cannodnaleFsi,@Qualifier("scalpel") Bicycle cannodnaleScalpel, @Qualifier("fsi2020") Bicycle cannondaleFsi2) {
        this.cannodnaleFsi = cannodnaleFsi;
        this.cannodnaleScalpel = cannodnaleScalpel;
        this.cannondaleFsi2 = cannondaleFsi2;
    }

    public List<Bicycle> getAllBicycle() {
        return Arrays.asList(cannodnaleFsi, cannondaleFsi2, cannodnaleScalpel);
    }

}
