package top.tinn.structural_pattern.DecoratorPattern;

/**
 * @ClassName ComponentDecorator
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 13:56
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
