package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMathApp {
    public static void main(String[] args) {

        // declare and initialize variables
        float floatMoney = 0;
        double doubleMoney = 0;
        BigDecimal bigDecMoney = BigDecimal.ZERO;


        int i = 0;
        // iterate 10 times
        while (i < 10) {
            // add 10 cents for each iteration
            floatMoney += .10;
            doubleMoney += .10;
            bigDecMoney = bigDecMoney.add(BigDecimal.valueOf(.10));

            // print value after every addition
            System.out.println("Float variable = " + floatMoney);
            System.out.println("double variable = " + doubleMoney);
            System.out.println("big decimal variable = " + bigDecMoney);
            System.out.println(); // new line
            i++;
        }
        // reset values back to 0
        floatMoney = 0;
        doubleMoney = 0;
        bigDecMoney = BigDecimal.ZERO;





    }

}
