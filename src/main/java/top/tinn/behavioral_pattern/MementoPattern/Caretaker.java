package top.tinn.behavioral_pattern.MementoPattern;

/**
 * @ClassName Caretaker
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 16:15
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
