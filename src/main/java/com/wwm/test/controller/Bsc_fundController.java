package com.wwm.test.controller;

import com.wwm.test.entity.Bsc_fund;
import com.wwm.test.service.Bsc_fundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;

@RestController
@RequestMapping("/test")
public class Bsc_fundController {

    private final Bsc_fundService bsc_fundService;

    @Autowired
    public Bsc_fundController(Bsc_fundService bsc_fundService) {
        this.bsc_fundService = bsc_fundService;
    }

    @RequestMapping("getFund/{fundcode}")
    public String QueryBsc_fund(@PathVariable String fundcode){
        StringBuilder returnString = new StringBuilder();
        if(bsc_fundService.getFund(fundcode) != null){
            for (Bsc_fund bsc_fund : bsc_fundService.getFund(fundcode)) {
                returnString.append(bsc_fund.toString()).append('\n');
            }
        }
        return returnString.toString();
    }

}
