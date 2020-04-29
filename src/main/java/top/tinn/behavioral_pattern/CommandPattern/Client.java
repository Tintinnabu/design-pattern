package top.tinn.behavioral_pattern.CommandPattern;

/**
 * @ClassName Client
 * @Description
 * @Author Tinn
 * @Date 2020/4/13 15:12
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.call();
    }

}
