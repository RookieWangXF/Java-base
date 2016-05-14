package cn.rookie.constructor;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.constructor
 * Description:使用javaBeans模式 构造过程被分装
 */
public class NutritionFacts2 {

    private int servingSize = -1;
    private int servings = -1;

    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;

    public NutritionFacts2() {

    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

}
