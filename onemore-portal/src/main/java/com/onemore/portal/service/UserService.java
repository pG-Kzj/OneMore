package com.onemore.portal.service;

import com.onemore.portal.entity.User;

public interface UserService {
    /**
     * 登录方法，验证手机号和密码
     *
     * @param mobile
     * @param password
     * @return
     */
    User login(String mobile, String password);


    /**
     * 查询多个id对应的user ，可以查一个（详情），可以查多个（关注）
     *
     * @param ids
     * @return
     */
    User selectByIds(Integer... ids);
}
