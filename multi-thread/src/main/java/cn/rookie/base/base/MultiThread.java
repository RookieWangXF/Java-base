package cn.rookie.base.base;


import com.sun.management.ThreadMXBean;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.util.ArrayList;

/**
 * Created by Rookie on 2016/8/17.
 * Package_name is cn.rookie.base.base
 * Description: Java程序在运行开始的时候，就会开启多个线程
 */
public class MultiThread {

    public static void main(String[] args) {
        //获取Java线程管理的MXBean
        ThreadMXBean threadMXBean = (ThreadMXBean) ManagementFactory.getThreadMXBean();
        //false不需要获取同步的monitor和synchronizer信息，仅获取线程和线程堆栈信息。
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "]" + threadInfo.getThreadName());
            System.out.println(threadInfo.toString());
        }

    }
}
