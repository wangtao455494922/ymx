package com.wjt.goods.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wjt.common.dubbo.IYmxGoodsService;
import com.wjt.common.model.YmxGoods;
import com.wjt.goods.dao.YmxGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @Description: 商品--业务实现类
 * @author wjt
 * @date 2019/1/22 9:21
 */
@Service(version = "${dubbo.application.version}")
public class YmxGoodsServiceImpl implements IYmxGoodsService<YmxGoods>
{
    @Autowired
    private YmxGoodsMapper mapper;


    @Override
    public List<YmxGoods> selectAll()
    {
        List<YmxGoods> list = mapper.selectAll();
        return list;
    }

    @Override
    public int insert(YmxGoods ymxGoods)
    {
        return mapper.insert(ymxGoods);
    }
}
