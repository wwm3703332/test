package com.wwm.test.service;

import com.wwm.test.entity.Bsc_fund;
import com.wwm.test.mapper.Bsc_fundMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Bsc_fundService {
    private final Bsc_fundMapper bscFundMapper;

    @Autowired
    public Bsc_fundService(Bsc_fundMapper bscFundMapper) {
        this.bscFundMapper = bscFundMapper;
    }

    public ArrayList<Bsc_fund> getFund(String fundcode){
        return bscFundMapper.getFund(fundcode);
    }
}
