package top.tinn.creational_pattern.BuilderPattern;

/**
 * @ClassName ConcreteBuilder
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 16:57
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        System.out.println("build partA");
    }

    @Override
    public void buildPartB() {
        System.out.println("build partB");
    }

    @Override
    public void buildPartC() {
        System.out.println("build partC");
    }
}
