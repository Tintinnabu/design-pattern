package top.tinn.creational_pattern.PrototypePattern.ShallowCopy;


import java.io.*;

/**
 * @ClassName WeeklyLog
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 16:40
 */
public class WeeklyLog implements Cloneable {
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public WeeklyLog clone(){
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog) obj;
        }catch (CloneNotSupportedException e){
            System.out.println("不支持克隆");
            return null;
        }
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
