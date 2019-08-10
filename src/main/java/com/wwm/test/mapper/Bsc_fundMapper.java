package com.wwm.test.mapper;

import com.wwm.test.entity.Bsc_fund;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface Bsc_fundMapper {
     Bsc_fund getFund(int settunit);
}
