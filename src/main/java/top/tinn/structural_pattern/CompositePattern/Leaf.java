package top.tinn.structural_pattern.CompositePattern;

/**
 * @ClassName Leaf
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 13:44
 */
public class Leaf extends Component {
    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        //
        System.out.println("operate leaf");
    }
}
