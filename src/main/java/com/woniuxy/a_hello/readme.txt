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
			
