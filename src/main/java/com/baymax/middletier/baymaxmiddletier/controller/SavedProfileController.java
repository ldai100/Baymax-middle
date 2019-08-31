package com.baymax.middletier.baymaxmiddletier.controller;

import com.baymax.middletier.baymaxmiddletier.service.UserService;
import com.baymax.middletier.baymaxmiddletier.vo.DayCare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SavedProfileController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/saved", method = GET)
    public List<DayCare> retrieveSavedProfiles(String userID){
        return userService.retrieveSavedProfiles(userID);
    }

}
