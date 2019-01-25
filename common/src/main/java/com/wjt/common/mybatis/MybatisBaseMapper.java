package com.wjt.common.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**  
* <p>Description:通用mapper接口 </p>  
* @author wjt  create
* @date 2019年1月18日 下午1:19:06
*/ 
public interface MybatisBaseMapper<T> extends Mapper<T>,MySqlMapper<T>{

}
