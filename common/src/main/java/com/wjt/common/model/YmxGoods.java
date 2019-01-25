package com.wjt.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author wjt
 * @Description: 商品--实体类
 * @date 2019/1/22 10:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ymx_goods")
public class YmxGoods implements Serializable
{
    @Id
    private Integer uuid;

    private String name;

    private String imgpath;

    private String description;

}
