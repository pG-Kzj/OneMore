package com.onemore.portal.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("dynamic")
public class Dynamic implements Serializable {

    private static final long serialVersionUID = 4292208320612015835L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String type;

    private String title;

    private String content;

    private String topic;

    private Integer authorId;

    private Integer parentId;

    private Integer commentsNum;

    private Integer likesNum;

    private Date createTime;

    public Dynamic() {
    }

}
