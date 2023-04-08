# idea连接mysql时区问题
- 检查时区
```sql
show variables like'%time_zone';
```
- 查看时区后来设置新的时区
```sql
set global time_zone='+8:00';
```

# [java 无效的目标发行版 11](https://blog.csdn.net/weixin_46294086/article/details/124203970)
设置项目字节码版本，想使用jdk1.8(或者jdk8)就设置为8，如果想要使用jdk11就设置为11。
在settings - Build, Execution, Deployment - Compiler - Java Compiler里的Project bytecode version

# @MapperScan
- 作用：指定要变成实现类的接口所在的包，然后包下面的所有接口在编译之后都会生成相应的实现类
- 添加位置：是在Springboot启动类上面添加，

# 报错找不到table时
实体类上面添加@TableName("数据库中的表名")并记得在主键上面添加@TableId
