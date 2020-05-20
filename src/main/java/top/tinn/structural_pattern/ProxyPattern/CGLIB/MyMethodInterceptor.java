package top.tinn.structural_pattern.ProxyPattern.CGLIB;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName MyMethodInterceptor
 * @Description
 * @Author Tintinnabu
 * @Date 2020/5/20 22:35
 */
public class MyMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("======插入前置通知======");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("======插入后者通知======");
        return object;
    }
}
