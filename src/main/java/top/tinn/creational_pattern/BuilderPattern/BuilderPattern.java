package top.tinn.creational_pattern.BuilderPattern;

/**
 * @ClassName BuilderPattern
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 16:58
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.contruct();
    }
}
