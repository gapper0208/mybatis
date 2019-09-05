1. jdbc hibernate mybatis的区别
	a. 开发效率
		hibernate > mybatis > jdbc
	b. 运行速度
		jdbc > mybatis > hibernate 

	c. mybatis门槛低，hibernate门槛高
	
	d. hibernate中模型有三种状态， mybatis中的模型没有状态之分。
	
2. 个人认为：开发的应用如果并发量不高，则可以使用hibernate，毕竟hibernate开发效率极高。
			开发的应用如果并发量很高的化，则应该使用mybatis，毕竟mybatis的运行速度更快！
			（但是处理高并发问题，并不是光用一个mybatis就能完全解决的。处理高并发有一套技术。）
			
			
========================================================================

3. mybatis环境搭建
	a. 导入依赖
		<dependency>
		    <groupId>org.mybatis</groupId>
		    <artifactId>mybatis</artifactId>
		    <version>3.5.2</version>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.35</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
		</dependency>
		<dependency>
		    <groupId>org.projectlombok</groupId>
		    <artifactId>lombok</artifactId>
		    <version>1.18.8</version>
		    <scope>provided</scope>
		</dependency>
		
	b. 建库建表：
		CREATE TABLE USER
		(
		  id INT PRIMARY KEY AUTO_INCREMENT,
		  NAME VARCHAR(20),
		  birthday DATE,
		  money DOUBLE
		);
	c. 创建模型
		@AllArgsConstructor
		@NoArgsConstructor
		@Data
		public class User implements Serializable {
			private Integer did;
			private String name;
			private Date birthday;
			private Double money;
		}
	d. 创建Mybatis子配置文件
		<?xml version="1.0" encoding="UTF-8" ?>
		<!DOCTYPE mapper
		 PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
		 "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
		 <!-- 
		 	mapper元素的namespace属性，可以胡写，建议写成包名+文件名（不带xml后缀）
		  -->
		<mapper namespace="com.woniuxy.a_hello.UserMapper">
			<insert id="save" parameterType="com.woniuxy.a_hello.User">
				insert into user values(null,#{name}, #{birthday}, #{money})
			</insert>
		</mapper>
	e. 创建Mybatis主配置文件
		<?xml version="1.0" encoding="UTF-8" ?>
		<!DOCTYPE configuration
		 PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
		 "http://mybatis.org/dtd/mybatis-3-config.dtd">
		<configuration>
			<environments default="development">
				<environment id="development">
					<transactionManager type="JDBC" />
					<dataSource type="POOLED">
						<property name="driver" value="com.mysql.jdbc.Driver" />
						<property name="url" value="jdbc:mysql:///test" />
						<property name="username" value="root" />
						<property name="password" value="123" />
					</dataSource>
				</environment>
			</environments>
			<mappers>
				<mapper resource="com/woniuxy/a_hello/UserMapper.xml" />
			</mappers>
		</configuration>
	f. 测试：
		参考AppTest
		
				
		
