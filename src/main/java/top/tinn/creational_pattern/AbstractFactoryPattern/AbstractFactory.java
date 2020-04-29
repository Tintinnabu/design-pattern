package top.tinn.creational_pattern.AbstractFactoryPattern;

/**
 * @ClassName AbstractFactory
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 15:00
 */
abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
