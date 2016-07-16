package cn.rookie.syncBlock;

/**
 * Created by Rookie on 2016/6/14.
 * Package_name is cn.rookie.syncBlock
 * Description:
 */
public class PairManager02 extends PairManager{

    @Override
    public void increment() {
        Pair temp;
        synchronized (this) {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        }
        store(temp);
    }
}
