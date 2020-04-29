package top.tinn.behavioral_pattern.MementoPattern;

/**
 * @ClassName Originator
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 16:11
 */
public class Originator {
    private String state;

    public Originator() {
    }

    public Memento createMemento(){
        return new Memento(this);
    }

    public void restoreMemento(Memento memento){
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

}
