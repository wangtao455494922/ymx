# ymx

## 平台简介

是mao项目的升级版,正在完善中.....,

## 模块简介

> common:公共配置信息及配置

> api:相当于Controller层,所有Request请求的入口

> goods:商品信息的Service层及Dao层

> store:库存信息的Service层及Dao层

## 完善进程
时间 | 内容 
----|------
2019-01-08 | 多模块拆分、部署
2019-01-18 | 集成dubbo,实现模块间相互调用调用


## 技术选型
#### 后端技术:
技术 | 名称 | 官网 | 说明
----|------|----|----
Spring Framework | 容器  |  |
SpringMVC | MVC框架  | |
MyBatis | ORM框架  | |
MyBatis Generator | 代码生成  | |
Druid | 数据库连接池  | |
Ehcache | 缓存框架  | |Mysql二级缓存
LogBack | 日志组件  | |
Maven | 项目构建管理  | |多模块
Memcached | 内存对象缓存系统  | |动态资源的缓存
Mongodb |  NoSQL | |非活跃数据的存储
Zookeerper |  分布式协助服务 | |dubbo的注册中心
Dubbo | (阿里)分布式服务框架 | |模块间调用

#### 前端技术:
技术 | 名称 | 官网 | 说明
----|------|----|----
Nginx | 轻量的Web服务器  ||服务器的负载均衡
Varnish | 轻量的Web服务器 ||静态资源的缓存