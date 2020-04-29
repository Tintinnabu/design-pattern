package top.tinn.structural_pattern.CompositePattern;

/**
 * @ClassName Component
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 13:43
 */
abstract class Component {
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract Component getChild(int i);
    public abstract void operation();
}
