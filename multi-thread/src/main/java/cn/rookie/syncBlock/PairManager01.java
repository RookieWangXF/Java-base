package cn.rookie.syncBlock;

/**
 * Created by Rookie on 2016/6/14.
 * Package_name is cn.rookie.syncBlock
 * Description:
 */
public class PairManager01 extends PairManager {

    @Override
    public void increment() {
        p.incrementX();
        p.incrementY();
        store(getPair());
    }
}
