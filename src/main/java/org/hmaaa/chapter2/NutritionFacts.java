package org.hmaaa.chapter2;

import lombok.Getter;

@Getter
public class NutritionFacts {

  private final int servingSize; //(ml, 1회 제공량)
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  public static class Builder {

    private final int servingSize;
    private final int serving;

    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public Builder(int servingSize, int serving) {
      this.servingSize = servingSize;
      this.serving = serving;
    }

    public Builder calories(int val) {
      this.calories = val;
      return this;
    }

    public Builder fat(int val) {
      this.fat = val;
      return this;
    }

    public Builder sodium(int val) {
      this.sodium = val;
      return this;
    }

    public Builder carbohydrate(int val) {
      this.carbohydrate = val;
      return this;
    }

    public NutritionFacts build() {
      return new NutritionFacts(this);
    }
  }

  private NutritionFacts(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.serving;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrate = builder.carbohydrate;
  }

}
