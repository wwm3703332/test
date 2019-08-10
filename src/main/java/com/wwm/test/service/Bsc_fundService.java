package com.wwm.test.service;

import com.wwm.test.entity.Bsc_fund;
import com.wwm.test.mapper.Bsc_fundMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bsc_fundService {
    @Autowired
    Bsc_fundMapper bscFundMapper;
    public Bsc_fund getFund(int settunit){
        return bscFundMapper.getFund(settunit);
    }
}
