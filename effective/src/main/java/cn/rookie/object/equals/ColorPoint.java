package cn.rookie.object.equals;

import java.awt.*;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.object.equals
 * Description:
 */
public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }

        if (!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }

        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }

    public static void main(String[] args) {
        ColorPoint p1 = new ColorPoint(1, 2, Color.BLACK);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.RED);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p3));
    }
}
