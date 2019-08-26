package com.baymax.middletier.baymaxmiddletier.service;

import com.baymax.middletier.baymaxmiddletier.vo.DayCare;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    //This  method retrieves all saved profiles
    public List<DayCare> retrieveSavedProfiles(String userID){

        DayCare testDayCare = new DayCare();
        testDayCare.setDayCareName("Daycare 1 ");
        testDayCare.setAddress("abc");
        testDayCare.setDescription("no desc");

        DayCare testDayCare2 = new DayCare();
        testDayCare2.setDayCareName("Daycare 2 ");
        testDayCare2.setAddress("abc");
        testDayCare2.setDescription("no desc");


        List<DayCare> dayCares = new ArrayList<>();
        dayCares.add(testDayCare);
        dayCares.add(testDayCare2);
        return dayCares;
    }

}
