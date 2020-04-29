package top.tinn.behavioral_pattern.CommandPattern;

/**
 * @ClassName Invoker
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:10
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call(){
        System.out.println("invoker call");
        command.execute();
    }
}
