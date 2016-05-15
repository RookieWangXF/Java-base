package cn.rookie.enumDesign;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.enumDesign
 * Description: 可以指定每个对象的值
 */
public enum Ensemble {
    SOLO(1),DUET(2),TRIO(3),QUARTET(4),
    SEPTET(7),DECTET(10);

    private final int size;
    Ensemble(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
