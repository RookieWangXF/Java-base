package cn.rookie.resource;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.resource
 * Description:
 */
public abstract class IntGenerator {

    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel(){
        canceled = true;
    }

    public boolean isCanceled(){
        return canceled;
    }
}
