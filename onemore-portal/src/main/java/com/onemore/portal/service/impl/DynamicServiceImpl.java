package com.onemore.portal.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.github.pagehelper.Constant;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onemore.portal.entity.Dynamic;
import com.onemore.portal.mapper.DynamicMapper;
import com.onemore.portal.service.DynamicService;

import java.util.List;

/**
 * @author kzj
 */
@Service
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicMapper dynamicMapper;

    @Override
    public void insert(Dynamic dynamic) {
        dynamicMapper.insert(dynamic);
    }

    @Override
    public List<Dynamic> getDynamics(int pageNo, int pageSize) {
        List<Dynamic> dynamics = dynamicMapper.selectPage(new RowBounds(pageNo, pageSize), null);
        return dynamics;
    }

    @Override
    public Dynamic getDynamic(Integer id) {
        return dynamicMapper.selectById(id);
    }

    @Override
    public int delete(Integer id) {
        return dynamicMapper.deleteById(id);
    }

    @Override
    public int update(Dynamic dynamic) {
        return dynamicMapper.updateById(dynamic);
    }

}
