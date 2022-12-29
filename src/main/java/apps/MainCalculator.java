package apps;

import models.Calculator;

public class MainCalculator {
    public static void main(String[]args){
        System.out.println(Calculator.sum(10,7));
        System.out.println(Calculator.subtract(10,7));
        System.out.println(Calculator.multiply(10,7));
        System.out.println(Calculator.divide(10,7));
    }

}
