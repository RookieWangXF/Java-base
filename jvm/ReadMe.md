### jvm
------
学习jvm相关的知识
1. 哪些内存需要回收  堆+方法区
2. 回收的是内存中的哪些数据
3. 什么时候进行回收  可达性分析+引用判断
4. 如何回收？ 分代采用不同的策略
~~~
收集算法：
* 标记清除算法   零碎
* 复制算法   缩小了一半内存
     新生代(Eden:from Survivor:to Survivor = 8:1:1)  原因：一般情况下98%的新生代对象会被回收
* 标记-整理算法 标记使用的，清理的时候都转移到一边
     老年代 原因：当Survivor空间不够时候使用。(空间大于新生代)
~~~
---
5. 垃圾收集器的具体实现（目标是为了满足服务的响应速度，希望系统停留的时间最短）

        CMS收集器：基于标记-清除算法的
        * 初始标记  需要 stop the world
        * 并发标记
        * 重新标记
        * 并发清除

6. Minor GC、Major GC和Full GC之间的区别
~~~
* 每次 Minor GC 会清理年轻代的内存
* Major GC 是清理永久代。(不用care到底是叫 Major GC 还是 Full GC，大家应该关注当前的 GC 是否停止了所有应用程序的线程，还是能够并发的处理而不用停掉应用程序的线程。)
* Full GC 是清理整个堆空间—包括年轻代和永久代
~~~

7. 永久代（虽然jvm将其作为堆的一个逻辑部分，但只是说用永久代来实现方法区而已）
就是方法区，又叫做非堆，存储的是一些类常量及类信息、常量池，并不是从老年代活下来的对象。

8. 大对象将直接进入老年代；长期存活对象将进入老年代