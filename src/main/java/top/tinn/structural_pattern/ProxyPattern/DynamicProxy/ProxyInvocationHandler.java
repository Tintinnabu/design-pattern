package top.tinn.structural_pattern.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyInvocationHandler
 * @Description 代理逻辑
 * @Author Tintinnabu
 * @Date 2020/5/20 22:22
 */
public class ProxyInvocationHandler implements InvocationHandler {
     private Object object;

    public ProxyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        method.invoke(object, args);
        System.out.println("after");
        return null;
    }


}
