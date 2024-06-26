package com.jobsheet15.praktikum02;
import java.util.*;
public class LoopCollection27 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");
        fruits.set(fruits.size() - 1, "Strawberry");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + (fruits.toString()));
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }
        
        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        System.out.println("");
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");
        System.out.print("Before Sorting : ");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        System.out.print("After Sorting  : ");
        Collections.sort(fruits);
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
    }
}