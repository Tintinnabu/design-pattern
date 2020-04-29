package top.tinn.creational_pattern.PrototypePattern.DeepCopy;

/**
 * @ClassName Client
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 16:44
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous,log_now = null;
        log_previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        log_previous.setAttachment(attachment);
        try {
            log_now = log_previous.deepClone();

        }catch (Exception e){
            System.out.println("失败");
        }
        System.out.println(log_previous == log_now);
        System.out.println(log_previous.getAttachment() == log_now.getAttachment());
    }
}
