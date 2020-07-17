package com.company;

public class UtilRandom {
    public static int rand(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
