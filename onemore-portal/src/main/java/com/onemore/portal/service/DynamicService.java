package com.onemore.portal.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.github.pagehelper.PageInfo;
import com.onemore.portal.entity.Dynamic;
import com.onemore.portal.vo.DynamicVO;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author kzj
 */
public interface DynamicService {

    void save(Dynamic dynamic);

    /**
     * 获取所有
     *
     * @return
     */
    Page<DynamicVO> getDynamics(int pageNo, int pageSize);

    Dynamic getDynamic(Integer id);

    int delete(Integer id);

    int update(Dynamic dynamic);
}
