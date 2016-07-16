package cn.rookie.syncBlock;

/**
 * Created by Rookie on 2016/6/14.
 * Package_name is cn.rookie.syncBlock
 * Description:
 */
public class PairManipulator implements Runnable {

    private PairManager pm;

    public PairManipulator(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true) {
            pm.increment();
        }
    }

    @Override
    public String toString() {
        return "Pair: " + pm.getPair() + " checkCounter = " + pm.checkCounter.get();
    }

}
