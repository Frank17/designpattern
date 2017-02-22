# 简单工厂模式（静态工厂模式）

> 引用至：[简单工厂模式](http://design-patterns.readthedocs.io/zh_CN/latest/creational_patterns/simple_factory.html)


简单工厂模式，适用于在一个软件系统中，可能需要一系列的产品（对象），而这些对象都具有同一个基类，即属于相同一个产品族。在该情况下，我们通常通过工厂，传入一个参数即可获取到不同的对象，而不用手动分别实例化各个对象，无需知道类名，降低了耦合度。

如在java中：

	DateFormat formatFull = DateFormat.getDateInstance(DateFormat.FULL);
	
	DateFormat formatDefault = DateFormat.getDateInstance();
	
	DateFormat formatLong = DateFormat.getDateInstance(DateFormat.LONG);


UML图如下：
![类图](http://design-patterns.readthedocs.io/zh_CN/latest/_images/SimpleFactory.jpg)

适用情形[（链接）](http://design-patterns.readthedocs.io/zh_CN/latest/creational_patterns/simple_factory.html#id24)：
* 工厂类负责创建的对象比较少：由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂。
* 客户端只知道传入工厂类的参数，对于如何创建对象不关心：客户端既不需要关心创建细节，甚至连类名都不需要记住，只需要知道类型所对应的参数。