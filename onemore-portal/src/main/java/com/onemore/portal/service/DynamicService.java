package com.onemore.portal.service;

import com.onemore.portal.entity.Dynamic;

import java.util.List;

/**
 * @author kzj
 */
public interface DynamicService {

    void insert(Dynamic dynamic);

    /**
     * 获取所有
     *
     * @param pageNo
     * @return
     */
    List<Dynamic> getDynamics(int pageNo, int pageSize);

    Dynamic getDynamic(Integer id);

    int delete(Integer id);

    int update(Dynamic dynamic);
}
