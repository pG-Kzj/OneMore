package com.onemore.portal.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.onemore.portal.entity.Dynamic;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author kzj
 */
@Mapper
public interface DynamicMapper extends BaseMapper<Dynamic> {

}
