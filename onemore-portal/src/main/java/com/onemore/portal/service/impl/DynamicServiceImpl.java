package com.onemore.portal.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.IPage;
import com.github.pagehelper.PageInfo;
import com.onemore.portal.vo.DynamicVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.onemore.portal.entity.Dynamic;
import com.onemore.portal.mapper.DynamicMapper;
import com.onemore.portal.service.DynamicService;

import java.util.List;

/**
 * @author kzj
 * ServiceImpl<DynamicMapper, Dynamic> :mybatis-plus提供
 */
@Service
public class DynamicServiceImpl extends ServiceImpl<DynamicMapper, Dynamic> implements DynamicService {

    @Autowired
    private DynamicMapper dynamicMapper;

    @Override
    public void save(Dynamic dynamic) {
        dynamicMapper.insert(dynamic);
    }

    @Override
    @Cacheable(value = "dynamics", key = "methodName", unless = "#result == null", cacheManager = "cacheManager")
    public Page<DynamicVO> getDynamics(int pageNo, int pageSize) {
        Page<DynamicVO> page = new Page<>(pageNo, pageSize);
        page.setRecords(dynamicMapper.getDynamics(page));
        return page;
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
