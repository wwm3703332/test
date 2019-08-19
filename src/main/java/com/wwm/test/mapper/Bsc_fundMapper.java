package com.wwm.test.mapper;

import com.wwm.test.entity.Bsc_fund;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface Bsc_fundMapper {
     ArrayList<Bsc_fund> getFund(@Param(value="fundcode") String fundcode);
}
