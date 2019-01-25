package com.wjt.common.dubbo;

import java.util.List;

/**
 * @author wjt
 * @Description: 商品--业务层
 * @date 2019/1/23 9:16
 */
public interface IYmxGoodsService<T>
{
    List<T> selectAll();
    int insert(T t);

}
