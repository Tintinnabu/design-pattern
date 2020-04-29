package top.tinn.behavioral_pattern.CommandPattern;

/**
 * @ClassName ConcreteCommand
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:11
 */
public class ConcreteCommand extends Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
