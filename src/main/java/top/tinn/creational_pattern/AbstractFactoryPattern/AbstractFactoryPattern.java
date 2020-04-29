package top.tinn.creational_pattern.AbstractFactoryPattern;

/**
 * @ClassName AbstractFactoryPattern
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 15:04
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        AbstractProductA productA1 = factory.createProductA();
        AbstractProductB productB1 = factory.createProductB();
        productA1.methodA();
        productB1.methodB();
    }
}
