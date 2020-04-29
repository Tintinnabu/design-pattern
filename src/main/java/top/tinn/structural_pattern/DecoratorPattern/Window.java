package top.tinn.structural_pattern.DecoratorPattern;

/**
 * @ClassName Window
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 13:55
 */
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示窗体");
    }
}
