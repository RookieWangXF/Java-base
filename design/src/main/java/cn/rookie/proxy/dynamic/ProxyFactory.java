package cn.rookie.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.proxy.dynamic
 * Description: 代理对象，不需要实现接口，给所有类创建代理对象
 */
public class ProxyFactory {

    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象，生成代理对象
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启事务");
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务");
                        return returnValue;
                    }
                });
    }
}
