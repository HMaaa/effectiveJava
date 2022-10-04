package org.hmaaa;

import org.hmaaa.chapter2.Calzone;
import org.hmaaa.chapter2.IsRomanNumeral;
import org.hmaaa.chapter2.NutritionFacts;
import org.hmaaa.chapter2.NutritionFacts.Builder;
import org.hmaaa.chapter2.NyPizza;
import org.hmaaa.chapter2.NyPizza.Size;
import org.hmaaa.chapter2.Pizza.Topping;

public class Main {

  public static void main(String[] args) {

    long sum = 0L;

    for (long i=0; i<Integer.MAX_VALUE; i++) {
      sum += i;
    }

    System.out.println(sum);


  }
}