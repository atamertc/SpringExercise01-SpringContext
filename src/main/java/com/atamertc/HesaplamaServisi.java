package com.atamertc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class HesaplamaServisi {
    private final DataService dataService;

    public HesaplamaServisi(@Qualifier("mongoDb") DataService dataService) {
        this.dataService = dataService;
    }


    public int maxBul() {
        return Arrays.stream(dataService.getData()).max().orElse(0);
    }
}
