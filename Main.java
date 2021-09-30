package com.company;

public class Main {

    public static void main(String[] args) {
        Car[] arr = new Car[] {new Bmw(), new Audi()};

        for (Integer i = 0; i < arr.length; i++) {
            arr[i].color();
        }
    }
}
