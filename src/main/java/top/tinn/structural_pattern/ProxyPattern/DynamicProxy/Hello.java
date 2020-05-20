package top.tinn.structural_pattern.ProxyPattern.DynamicProxy;

/**
 * @ClassName Hello
 * @Description
 * @Author Tintinnabu
 * @Date 2020/5/20 22:26
 */
public class Hello implements HelloInterface {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
