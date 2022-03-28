# 工程简介
SpringBoot 整合 Ehcache Demo项目。
架构： SpringBoot+Mysql+Mybatis-Plus+EhCache
该篇暂未涉及cacheManager等知识。
Mybatis-Plus的一些语法见 HELP.md

# 槽点
@CachePut 标记的方法必须返回更新对象，如果为void，将会把缓存置空，导致缓存时间内返回空

# 测试
分别调用，测试控制台是否打印了sql。

# 延伸阅读
参考文章:
- http://mybatis.org/spring/zh/boot.html
- http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/
- https://blog.csdn.net/qq_40065776/article/details/107560607