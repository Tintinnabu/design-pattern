package top.tinn.creational_pattern.FactoryMethodPattern;

import java.util.Properties;

/**
 * @ClassName FactoryMethodPattern
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 14:45
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
        product.methodDiff();
    }
}
