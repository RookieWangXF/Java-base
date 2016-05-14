package cn.rookie.constructor;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.constructor
 * Description:多个构造器，每个都都可选参数的时候
 * 如果顺序写错了，就危险了！
 */
public class NutritionFacts {

    private final int servingSize;
    private final int servings;

    private final int calories;
    private final int fat;
    private final int sodium;

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize,servings,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize,servings,calories,0);
    }


    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize,servings,calories,fat,0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
    }
}
