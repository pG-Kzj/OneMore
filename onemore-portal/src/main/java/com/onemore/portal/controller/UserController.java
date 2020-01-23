package com.onemore.portal.controller;

import com.onemore.portal.entity.User;
import com.onemore.portal.service.UserService;
import com.onemore.portal.util.ResultUtil;
import com.onemore.portal.vo.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    @ApiOperation(value = "login", notes = "登录方法，手机号+密码")
    public Result<User> login(@Param("mobile") String mobile,
                              @Param("password") String password) {
        User user = userService.login(mobile, password);
        if (null == user) {
            return ResultUtil.error(400, "登录失败，用户名或密码错误");
        }
        return ResultUtil.success(user);
    }

    @PostMapping("")
    public Result<User> getUserByIds() {
        // TODO: 2020/1/22 zhangyutong
        return ResultUtil.success();
    }
}
