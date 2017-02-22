# 工厂方法模式

> 引用自：[工厂方法模式](http://design-patterns.readthedocs.io/zh_CN/latest/creational_patterns/factory_method.html)

在简单工厂模式中，我们需要适用参数，才能获取到不同的对象，若在系统和程序的开发过程中，我们需要增加一类产品，那么我们则必须要去修改相应的工厂，才能够获取到产品，破坏了开闭原则。


从而我们引入了工厂方法模式，用于将产品的生产，交付于子类的工厂中，将工厂抽象出来，由不同的工厂负责生产不同的产品即可。若需要扩展产品，则只需要相应增加所对应的产品工厂即可，无需修改原有的工厂。


UML图如下:
![类图](http://design-patterns.readthedocs.io/zh_CN/latest/_images/FactoryMethod.jpg)

> 缺点：若增加产品，则必须增加工厂，类个数增多，抽象程度更高，理解度更难