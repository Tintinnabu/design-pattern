package top.tinn.creational_pattern.FactoryMethodPattern;

/**
 * @ClassName ConcreteProduct
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 14:44
 */
public class ConcreteProduct implements Product {
    @Override
    public void methodDiff() {
        System.out.println("ConcreteProduct");
    }
}
