package cn.rookie.constructor;

/**
 * Created by Rookie on 2016/5/14.
 * Package_name is cn.rookie.constructor
 * Description:建立一个内部类 当做构建器
 */
public class NutritionFactsBuilder {

    private final int servingSize;
    private final int servings;

    private final int calories;
    private final int fat;
    private final int sodium;

    public static class Builder{
        private final int servingSize;
        private final int servings;

        private int calories = 0 ;
        private int fat = 0;
        private int sodium = 0;

        public Builder(int servingSize,int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            /**
             * 每一个方法都可以单独增加检验措施
             */
            calories = val;
            return this;
        }
        public Builder fat(int val) {
            fat = val;
            return this;
        }
        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFactsBuilder build() {
            return new NutritionFactsBuilder(this);
        }
    }

    private NutritionFactsBuilder(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
    }

    @Override
    public String toString() {
        return "NutritionFactsBuilder{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                '}';
    }

    public static void main(String[] args) {
        NutritionFactsBuilder builder = new NutritionFactsBuilder.Builder(240, 89).calories(11).fat(12).sodium(45).build();
        System.out.println(builder.toString());
    }
}
