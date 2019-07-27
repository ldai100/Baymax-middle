package com.baymax.middletier.baymaxmiddletier.service;

import com.baymax.middletier.baymaxmiddletier.vo.DayCare;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    public List<DayCare> searchDayCareByAddress(String address){

        DayCare testDayCare = new DayCare();
        testDayCare.setDayCareName("Daycare 1 ");
        testDayCare.setAddress("abc");
        testDayCare.setDescription("no desc");
        List<DayCare> dayCares = new ArrayList<>();
        dayCares.add(testDayCare);
        return dayCares;
    }
}
