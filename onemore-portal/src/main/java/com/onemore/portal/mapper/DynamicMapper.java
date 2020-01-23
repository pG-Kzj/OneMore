package com.onemore.portal.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.onemore.portal.entity.Dynamic;
import com.onemore.portal.vo.DynamicVO;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author kzj
 */
@Mapper
public interface DynamicMapper extends BaseMapper<Dynamic> {
    @Select("SELECT d.id, d.type, d.title, d.content, d.topic, d.comments_num, d.create_time, u.`name`, d.likes_num, d.parent_id FROM dynamic d,user u WHERE d.author_id = u.id")
    List<DynamicVO> getDynamics(Pagination page);
}
