package top.tinn.structural_pattern.BridgePattern;

/**
 * @ClassName Abstraction
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 13:36
 */
abstract class Abstraction {
    protected Implementor impl;

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    public abstract void operation();
}
