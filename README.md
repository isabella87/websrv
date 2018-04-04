# websrv -应用ssh（注解版）及maven的web应用开发框架

------

# 注解版说明

ssh为spring，struts,hibernate 。其中Spring主要提供对整个应用服务的控制，主要包含以下几大功能IOC （控制反转），DI（依赖注入）。struts主要提供对action事务的控住。Hibernate主要是构建数据层的交互。

## 使用注解的好处：

+使用注解，应用服务的配置文件可以精简到只需要web.xml，applicationContext.xml和strunts.xml。原来的关于Hibernate可以完全由Spring来管理，是的hibernate.cfg.xml及众多的映射文件 *.hbm.xml也省了。

+applicationContext.xml里配置了数据库连接的基本信息（对hibernate的管理），还有对所有bean的自动装配管理和事务的管理。

+struts.xml里配置了一些struts的基本参数，并告诉容器用Spring来管理自己。

+web.xml中包含了Spring和Struts的基本配置，自动扫描Action的配置（通知tomcat，我要使用注解来配置struts）；

