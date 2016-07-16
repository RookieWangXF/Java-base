package cn.rookie.syncBlock;

/**
 * Created by Rookie on 2016/6/14.
 * Package_name is cn.rookie.syncBlock
 * Description:
 */
public class PairChecker implements Runnable {

    private PairManager pm;

    public PairChecker(PairManager pm){
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            pm.checkCounter.incrementAndGet();
            pm.getPair().checkState();
        }
    }
}
