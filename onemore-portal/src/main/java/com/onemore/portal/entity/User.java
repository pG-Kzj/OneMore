package com.onemore.portal.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("user")
public class User {

    private Integer id;

    private String name;

    private String mobile;

    private String password;

    private String describes;
}
