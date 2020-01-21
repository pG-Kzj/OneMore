package com.onemore.portal.enums;

import lombok.Getter;

@Getter
public enum DynamicTypeEnum {

    // 问答、图文、影视、电台、小记'
    DYNAMIC_QUESTION_ANSWERS(1, "问答"),
    DYNAMIC_IMAGE_TEST(2, "图文"),
    DYNAMIC_MOVIES(3, "影视"),
    DYNAMIC_RADIO_STATION(4, "电台"),
    DYNAMIC_NOTES(5, "小记");

    /**
     * 类型
     */
    private Integer key;
    /**
     * 名称
     */
    private String name;

    DynamicTypeEnum(Integer key, String name) {
        this.key = key;
        this.name = name;
    }
}
