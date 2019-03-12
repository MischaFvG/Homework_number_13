package com.cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Reflection {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of the method");
        String methodName = s.nextLine();
        Reflection reflection = new Reflection();
        try {
            Method method = reflection.getClass().getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(reflection);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private void method1() {
        System.out.println("Method 1");
    }

    private void method2() {
        System.out.println("Method 2");
    }

    private void method3() {
        System.out.println("Method 3");
    }
}
