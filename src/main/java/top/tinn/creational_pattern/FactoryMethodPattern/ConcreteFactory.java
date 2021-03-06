package top.tinn.creational_pattern.FactoryMethodPattern;

/**
 * @ClassName ConcreteFactory
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 14:43
 */
public class ConcreteFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
