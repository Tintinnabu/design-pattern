package top.tinn.creational_pattern.BuilderPattern;

/**
 * @ClassName Director
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 16:56
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product contruct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
