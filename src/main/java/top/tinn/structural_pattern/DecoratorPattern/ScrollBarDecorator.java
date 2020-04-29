package top.tinn.structural_pattern.DecoratorPattern;

/**
 * @ClassName ScrollBarDecorator
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 13:56
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }
    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("增加滚动条");
    }
}
