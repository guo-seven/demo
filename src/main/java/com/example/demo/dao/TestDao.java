package com.example.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/9/3.
 */
@Repository
public interface TestDao {
    String getConfig(@Param("attribute")String attribute);
}
