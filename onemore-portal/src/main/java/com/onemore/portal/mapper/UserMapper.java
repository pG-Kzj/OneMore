package com.onemore.portal.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.onemore.portal.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 登录调用
     *
     * @param mobile
     * @param password
     * @return
     */
    @Select("SELECT id,name,describes FROM USER WHERE MOBILE = #{mobile} AND PASSWORD = #{password} ")
    User login(@Param("mobile") String mobile, @Param("password") String password);
}
