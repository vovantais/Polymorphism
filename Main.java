package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] arr = new Shape[] {new Circle(), new Square(), new Triangle()};

        for (Integer i = 0; i < arr.length; i++) {
            arr[i].draw();
        }
    }
}
