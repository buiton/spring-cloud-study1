###### spring-cloud-study1为聚合项目，外层为空的maven项目，<package></package>为pom类型，作为父项目统一管理jar包依赖，<model></model>为关联的子项目名称，内层通过<parent></parent>标签关联父项目，引用jar包依赖
###### idea 开发时应用启动注意标记文件的source root，否则SpringBoot启动按钮不生效
###### idea 开发时new model比直接复制修改要好，复制修改会导致注册eureka时的一些未知异常
