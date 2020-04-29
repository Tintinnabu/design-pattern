package top.tinn.creational_pattern.PrototypePattern.ShallowCopy;

import java.io.Serializable;

/**
 * @ClassName Attachment
 * @Description
 * @Author Tinn
 * @Date 2020/4/12 16:39
 */
public class Attachment {

    private String name;
    public void download(){
        System.out.println("下载"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
