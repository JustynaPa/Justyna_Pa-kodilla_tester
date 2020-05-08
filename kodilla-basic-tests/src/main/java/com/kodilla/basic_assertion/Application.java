package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double c = 3;
        double d = 2;

        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int substractResult = calculator.substract(a, b);
        correct = ResultChecker.assertEquals(-3, substractResult);
        if (correct) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        double powerResult = calculator.toPowerOf(c, d);
                correct = ResultChecker.assertEquals2(9, powerResult);
        if (correct) {
            System.out.println("Metoda toPowerOf działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda toPowerOf nie działa poprawnie dla liczb " + c + " i " + d);
        }


        }

    }

