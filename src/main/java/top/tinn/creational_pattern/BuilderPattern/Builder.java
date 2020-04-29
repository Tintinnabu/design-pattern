package top.tinn.creational_pattern.BuilderPattern;

/**
 * @ClassName Builder
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 16:55
 */
abstract class Builder {
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public Product getResult(){
        return product;
    }
}
