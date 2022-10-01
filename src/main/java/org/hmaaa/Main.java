package org.hmaaa;

import org.hmaaa.chapter2.Calzone;
import org.hmaaa.chapter2.NutritionFacts;
import org.hmaaa.chapter2.NutritionFacts.Builder;
import org.hmaaa.chapter2.NyPizza;
import org.hmaaa.chapter2.NyPizza.Size;
import org.hmaaa.chapter2.Pizza.Topping;

public class Main {

  public static void main(String[] args) {

    NutritionFacts nutritionFacts = new NutritionFacts.Builder(240, 8)
        .calories(100)
        .sodium(35)
        .carbohydrate(27)
        .build();

    NyPizza pizza = new NyPizza.Builder(Size.SMALL)
        .addTopping(Topping.SAUSAGE)
        .addTopping(Topping.ONION)
        .build();

    Calzone calzone = new Calzone.Builder()
        .addTopping(Topping.SAUSAGE)
        .addTopping(Topping.HAM)
        .build();

    System.out.println(nutritionFacts.getSodium());
    System.out.println(pizza.getSize());
    System.out.println(calzone.toString());

  }
}