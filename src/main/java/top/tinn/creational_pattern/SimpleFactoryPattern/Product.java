package top.tinn.creational_pattern.SimpleFactoryPattern;

/**
 * @ClassName Product
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 14:29
 */
abstract class Product {
    public void methodSame(){
        System.out.println("Product");
    }

    public abstract void methodDiff();
}
