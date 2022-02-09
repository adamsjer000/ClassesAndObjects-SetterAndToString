package com.company;

public class Main {

    public static void main(String[] args) {

        Rect rect1 = new Rect(2,4);

        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());


        rect1.setWidth(5);
        rect1.setLength(10);
        System.out.println(rect1.getLength());
        System.out.println(rect1.getWidth());
    }
}