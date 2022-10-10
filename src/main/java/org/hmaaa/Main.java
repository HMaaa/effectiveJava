package org.hmaaa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.hmaaa.chapter2.Calzone;
import org.hmaaa.chapter2.IsRomanNumeral;
import org.hmaaa.chapter2.NutritionFacts;
import org.hmaaa.chapter2.NutritionFacts.Builder;
import org.hmaaa.chapter2.NyPizza;
import org.hmaaa.chapter2.NyPizza.Size;
import org.hmaaa.chapter2.Pizza.Topping;
import org.hmaaa.chapter2.Stack;
import org.hmaaa.chapter3.PhoneNumber;

public class Main {
  public static void main(String[] args) throws IllegalAccessException {

    PhoneNumber phoneNumber = new PhoneNumber(1, 2, 3);

    PhoneNumber phoneNumber1 = new PhoneNumber(1, 2, 2);

    System.out.println(phoneNumber1.toString());


  }
}