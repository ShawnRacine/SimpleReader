package com.racine.mapper;

import com.racine.beans.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by sunrx on 2016/9/27.
 */
@Mapper
public interface UserMapper {
    UserInfo queryUser(@Param(value = "userId") int id);
}
