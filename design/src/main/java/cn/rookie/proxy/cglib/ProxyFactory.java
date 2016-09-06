package cn.rookie.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Rookie on 2016/8/16.
 * Package_name is cn.rookie.proxy.cglib
 * Description:对UserDao生成子类对象
 */
public class ProxyFactory implements MethodInterceptor{

    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务.....");

        // 执行目标对象的方法
        Object returnValue = method.invoke(target, objects);

        System.out.println("提交事务.....");

        return returnValue;
    }


}
