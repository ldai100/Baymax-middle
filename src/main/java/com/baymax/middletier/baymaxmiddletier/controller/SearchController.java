package com.baymax.middletier.baymaxmiddletier.controller;

import com.baymax.middletier.baymaxmiddletier.service.SearchService;
import com.baymax.middletier.baymaxmiddletier.vo.DayCare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    SearchService searchService;


    @RequestMapping(value = "/address", method = GET)
    public List<DayCare> searchByAddress(@PathVariable("address")String address){
        searchService.searchDayCareByAddress(address);
        return searchService.searchDayCareByAddress(address);
    }


}
