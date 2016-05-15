package cn.rookie.enumDesign;

import java.util.EnumSet;
import java.util.Set;

/**
 * Created by Rookie on 2016/5/15.
 * Package_name is cn.rookie.enumDesign
 * Description:
 */
public class EnumSetDemo {
    public enum Style{
        BOLD,ITALIC, UNDERLINE
    }

    public void applyStyles(Set<Style> styles) {

    }

    public static void main(String[] args) {
        EnumSetDemo e = new EnumSetDemo();
        e.applyStyles(EnumSet.of(Style.ITALIC,Style.BOLD));
    }
}
