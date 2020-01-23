package com.onemore.portal.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.StringJoiner;

@Getter
@Setter
public class DynamicVO {
    private Integer id;

    private String type;

    private String title;

    private String content;

    private String topic;

    private String name;

    private Integer parentId;

    private Integer commentsNum;

    private Integer likesNum;

    private Date createTime;

    @Override
    public String toString() {
        return new StringJoiner(", ", DynamicVO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("type='" + type + "'")
                .add("title='" + title + "'")
                .add("content='" + content + "'")
                .add("topic='" + topic + "'")
                .add("name='" + name + "'")
                .add("parentId=" + parentId)
                .add("commentsNum=" + commentsNum)
                .add("likesNum=" + likesNum)
                .add("createTime=" + createTime)
                .toString();
    }


}
