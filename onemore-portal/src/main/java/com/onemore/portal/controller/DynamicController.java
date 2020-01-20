package com.onemore.portal.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.github.pagehelper.IPage;
import com.github.pagehelper.PageInfo;
import com.onemore.portal.entity.Result;
import com.onemore.portal.util.ResultUtil;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.onemore.portal.entity.Dynamic;
import com.onemore.portal.service.DynamicService;

import java.util.List;

import static com.onemore.portal.enums.ResultEnum.USER_NOT_EXIST;

/**
 * @author kzj
 */
@Log
@RestController
@RequestMapping("dynamic")
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;

    /**
     * 增加一条主表数据
     *
     * @param dynamic
     * @return
     */
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public Result insert(Dynamic dynamic) {
        dynamicService.insert(dynamic);
        return ResultUtil.success();
    }

    /**
     * 查询dynamic 查询所有,分页
     *
     * @param ids
     * @return
     */
    @GetMapping("dynamics")
    public Result<Dynamic> select(@RequestParam(defaultValue = "0") int pageNo, //页码
                                  @RequestParam(defaultValue = "10") int pageSize) {//一页数据
        PageHelper.startPage(pageNo, pageSize);
        List<Dynamic> dynamics = dynamicService.getDynamics(pageNo, pageSize);
        return ResultUtil.success(dynamics);
    }

    /**
     * 查询dynamic 查询单个
     *
     * @param ids
     * @return
     */
    @GetMapping("dynamic")
    public Result selectOne(Integer id) {
        Dynamic dynamic = dynamicService.getDynamic(id);
        if (dynamic != null) {
            return ResultUtil.success(dynamic);
        }
        return ResultUtil.error(USER_NOT_EXIST.getCode(), USER_NOT_EXIST.getMsg());
    }

    /**
     * 删除一条
     *
     * @param id
     * @return
     */
    @GetMapping("deleteDynamic")
    public Result delete(Integer id) {
        int delete = dynamicService.delete(id);
        if (delete > 0) {
            return ResultUtil.success();
        }
        return ResultUtil.error(400, "删除错误");
    }

    /**
     * 更新一条数据通过id
     *
     * @param dynamic
     * @return
     */
    @PostMapping("updateDynamic")
    public Result update(Dynamic dynamic) {
        int update = dynamicService.update(dynamic);
        if (update > 0) {
            return ResultUtil.success();
        }
        return ResultUtil.error(400, "更新错误");
    }

}
