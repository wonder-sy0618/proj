项目结构
------------------------------

    这是一个用来演示基本结构的项目


* 应用的技术框架包括
    - Gradle
    > 系统构建及工具集
    - Spring MVC
    > 系统的MVC分离
    - MyBatis
    > ORM映射

* 检出项目
> git clone https://github.com/wonder-sy0618/proj.git   
> 构建IDE环境   
> 发布项目   
> 浏览器访问 http://<domain>:<port>/proj/demo/index.do


* 常用构建命令
> build.gradle是Gradle的脚本控制文件
> 在项目根目录下支持以下命令：
    - gradle eclipse
    > 生成eclipse j2ee项目结构，参考：*IDE* - *eclipse j2ee*
    - gradle myeclipse
    > 生成myeclipse项目结构，参考：*IDE* - *myeclipse*
    - gradle mbGenerator
    > 生成ORM单表映射文件，参考：*ORM单表映射*
    - gradle build
    > 构建项目
    - gradle war
    > 导出war包
    - gradle tasks
    > 打印当前Gradle支持的所有命令

* IDE
    - eclipse j2ee
        + 生成classpath
        > cd <project root\>   
        > gradle eclipse  
        + 导入eclipse
        > File - Import  
        > General - Existing Projects into Workspace  
        > Select root directory - Finish  
        > **注意：不要选择Copy projects into workspace**  
        + 配置web项目特性
        > 右击项目 - Properties  
        > Project Facets  
        > 选择Dynamic Web Module  
        > 设置WebContent路径为src/main/webapp  
    - myeclipse
        + 生成classpath
        > cd <project root\>  
        > gradle myeclipse  
        + 导入myeclipse
        + 配置Web项目特性

* ORM映射
    - ORM单表映射
        + 在数据库增加表
        + 修改database/generatorConfig.xml配置文件，增加table标签
        > <table tableName="student" domainObjectName="Student" \></table\>
        + 刷新单表ORM映射文件
        > gradle mbGenerator
        + 还原src/main/java/demo/proj/orm/dao/*
    - 复杂映射
    	+ 在src/main/java/demo/proj/orm/modelEx 包下扩展实体（继承或关联）  
    	+ 在src/main/resources/demo/proj/orm/xml/extend 包下扩展XML映射文件  
    	+ 在src/main/java/demo/proj/orm/dao 的对应Mapper中添加接口方法
    	+ **注意：根据Mybatis规则，Mapper接口必须与XML映射文件中的namespace一致**
