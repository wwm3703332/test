package com.wwm.test.controller;

import com.wwm.test.entity.Bsc_fund;
import com.wwm.test.service.Bsc_fundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Bsc_fundController {

    @Autowired
    private Bsc_fundService bsc_fundService;

    @RequestMapping("getFund/{settunit}")
    public Bsc_fund QueryBsc_fund(@PathVariable int settunit){
        return bsc_fundService.getFund(settunit);
    }

}
