##### api-gateway 
##### eureka-server 9000
##### ribbon-consumer 7000
##### welcome-server 8001


#### 分布式配置中心

每个微服务都有一份配置信息,大量的微服务带来的问题就是配置文件的维护困难,
顾提出了对配置进行统一管理,进行统一配置管理的服务为配置中心。

功能:
    配置文件集中管理
    分环境动态切换
    各个微服务主动拉取服务中心配置
    配置改变不需重启服务
    

