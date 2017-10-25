package com.selltom;



public class Main {

    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

    public static void main(String[] args) {
    System.out.print(arrondi(15.5674647884,5));
}
}
