package com.wjt.api.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wjt.common.dubbo.IYmxGoodsService;
import com.wjt.common.model.YmxGoods;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author wjt
 * @Description: dubbo测试类
 * @date 2019/1/21 16:39
 */
@RestController
public class ApiController
{

    @Reference(version = "${dubbo.application.goods.version}")
    private IYmxGoodsService ymxGoodsService;

    @PostMapping(value = "/getGoods")
    public String getGoods(){
        List<YmxGoods> list = ymxGoodsService.selectAll();
        return list.toString();
    }

    @PostMapping(value = "/insertGoods")
    public int insertGoods(){
        YmxGoods goods = new YmxGoods(2,"2","2","2");
        int y = ymxGoodsService.insert(goods);
        return y;
    }

}
