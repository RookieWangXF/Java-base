package cn.rookie.proxy.dynamic;

/**
 * Created by Rookie on 2016/5/17.
 * Package_name is cn.rookie.proxy.dynamic
 * Description:
 */
public class UserImpl implements IUser {

    @Override
    public void save() {
        System.out.println("————我是一个子类---");
    }

    @Override
    public void say() {
        System.out.println("say()");
    }

}
