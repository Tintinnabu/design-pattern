package top.tinn.creational_pattern.SimpleFactoryPattern;

/**
 * @Description SimpleFactoryPattern 简单工厂模式
 * @Author Tinn
 * @Date 2020/4/12 14:23
 */
public class SimpleFactoryPattern {
    public static void main(String[] args) {
        Product product = Factory.getProduct("A");
        product.methodSame();
        product.methodDiff();
    }
}
