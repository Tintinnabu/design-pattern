package top.tinn.structural_pattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Composite
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 13:44
 */
public class Composite extends Component {
    private List<Component> list = new ArrayList<>();
    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component com : list){
            com.operation();
        }
    }
}
