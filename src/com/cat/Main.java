package com.cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        arithmeticalMean();
    }

    private static void arithmeticalMean() {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(10));
        }
        System.out.println(list);
        List<Integer> newList = list.stream().map(x -> (int) Math.pow(x, 2)).collect(Collectors.toList());
        System.out.println(newList);
        double mean = newList.stream().collect(Collectors.averagingDouble(x -> x));
        System.out.println("Arithmetical mean is " + mean);
    }
}
