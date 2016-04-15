package cn.rookie.thread.create;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.*;

/**
 * Created by Rookie on 2016/4/14.
 * Description:
 * Project_name: Algorithm
 * Copyright (c) All Rights Reserved.
 */
public class CreateCallable implements Callable<String> {

    private int id;

    public CreateCallable(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result is " + id;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            results.add(exec.submit(new CreateCallable(i)));
        }
        for (Future<String> future : results) {
            System.out.println(future.get());
        }
    }
}
