package com.onemore.portal.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.onemore.portal.vo.Result;
import com.onemore.portal.util.ResultUtil;
import com.onemore.portal.vo.DynamicVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.onemore.portal.entity.Dynamic;
import com.onemore.portal.service.DynamicService;

import static com.onemore.portal.enums.ResultEnum.USER_NOT_EXIST;

/**
 * @author kzj
 */
@Log
@RestController
//@RequestMapping("dynamic")
@Api("主表信息")
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;

    /**
     * 增加一条主表数据
     *
     * @param dynamic
     * @return
     */
    @ApiOperation(value = "增加一条主表数据", notes = "增加一条主表数据,作者id即登陆人的id；如果是转发，则parentid为被转发的文章的id")
    @PostMapping(value = "dynamic")
    public Result insert(Dynamic dynamic) {
        dynamicService.save(dynamic);
        return ResultUtil.success();
    }

    /**
     * 查询dynamic 查询所有,分页
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping("dynamics")
    @ApiOperation(value = "查询所有,分页", notes = "查询所有,分页,传入pageNo、pageSize参数即可")
    public Result<Dynamic> select(@RequestParam(defaultValue = "1") int pageNo, //页码
                                  @RequestParam(defaultValue = "10") int pageSize) {//一页数据
        Page<DynamicVO> dynamics = dynamicService.getDynamics(pageNo, pageSize);
        return ResultUtil.success(dynamics);
    }

    /**
     * 查询dynamic 查询单个
     *
     * @param id
     * @return
     */
    @GetMapping("dynamic/{id}")
    @ApiOperation(value = "查询单条数据", notes = "查询单条数据，传入id即可")
    public Result selectOne(@PathVariable("id") Integer id) {
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
    @DeleteMapping("dynamic")
    @ApiOperation(value = "删除单条数据", notes = "删除单条数据，传入id即可")
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
    @PutMapping("dynamic")
    @ApiOperation(value = "更新单条数据", notes = "更新单条数据，传入参数即可")
    public Result update(Dynamic dynamic) {
        int update = dynamicService.update(dynamic);
        if (update > 0) {
            return ResultUtil.success();
        }
        return ResultUtil.error(400, "更新错误");
    }

}
