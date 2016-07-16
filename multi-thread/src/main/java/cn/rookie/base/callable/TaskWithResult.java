package cn.rookie.base.callable;

import java.util.concurrent.Callable;

/**
 * Created by Rookie on 2016/6/13.
 * Package_name is cn.rookie.base.callable
 * Description:
 */
public class TaskWithResult implements Callable<String> {

    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult " + id;
    }

}
