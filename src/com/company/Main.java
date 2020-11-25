package com.company;

public class Main {
    public static void main(String[] args) {

        Strategy add = (a, b) -> (a+b);
        Strategy subtract = (a, b) -> (a-b);
        Strategy multiply = (a, b) -> (a*b);
        Strategy division = (a, b) -> (a/b);



        execute(7, 8, add );
        execute(9, 4, subtract );
        execute(3, 14, multiply );
        execute(84, 5, division );


    }

    public static void execute(int a, int b, Strategy strategy) {
        double result = strategy.doOperation(a, b);
        System.out.println(result);
    }
}

interface Strategy {
    double doOperation(int a, int b);
}
