package top.tinn.behavioral_pattern.MementoPattern;

/**
 * @ClassName Memento
 * @Author Tinn
 * @Date 2020/4/13 16:12
 */
public class Memento {
    private String state;

    public Memento(Originator originator) {
        this.state = originator.getState();
    }

    public String getState() {
        return state;
    }

}
