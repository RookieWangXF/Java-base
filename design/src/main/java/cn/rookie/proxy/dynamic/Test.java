package cn.rookie.proxy.dynamic;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.proxy.dynamic
 * Description:
 */
public class Test {

    public static void main(String[] args) {
        IUser target = new UserImpl();

        //给目标对象创建代理对象
        IUser proxy = (IUser) new ProxyFactory(target).getProxyInstance();
        proxy.save();
        proxy.say();
        System.out.println(proxy);
        System.out.println(target.getClass());
        System.out.println(proxy.getClass());
    }
}
