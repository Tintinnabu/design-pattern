package top.tinn.creational_pattern.AbstractFactoryPattern;

/**
 * @ClassName ConcreteFactory1
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 15:03
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
