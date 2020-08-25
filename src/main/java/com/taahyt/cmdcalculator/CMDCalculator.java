package com.taahyt.cmdcalculator;


import com.taahyt.cmdcalculator.logger.Logger;
import com.taahyt.cmdcalculator.logger.LoggerLevel;

import java.util.*;

public class CMDCalculator
{

    //TODO: ADD CHECKS IF NEXT IS A NUMBER
    //TODO: FIX EXCEPTIONS

    private static Logger logger;

    private static List<Double> results = new ArrayList<Double>();

    public static void main(String[] args)
    {
        logger = new Logger();

        logger.log(LoggerLevel.NORMAL, "Hello! This is my little calculator I made! If you wish to exit out, \ntype ! on the operator question!");

        Scanner scanner = new Scanner(System.in);

        double first, second;
        char operator;

        double result = 0;
        do {

            logger.log(LoggerLevel.NORMAL, "Choose your first number!");
            first = scanner.nextDouble();
            logger.log(LoggerLevel.NORMAL, "Choose your second number!");
            second = scanner.nextDouble();
            logger.log(LoggerLevel.NORMAL, "Choose an operator!");
            operator = scanner.next().charAt(0);



            switch (operator)
            {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    result = first / second;
                    break;
                case '%':
                    result = first % second;
                    break;
                case '!':
                    System.exit(0);
                    break;
            }
            results.add(result);
            result = 0;
            for (Double d : results)
            {
                result += d;
            }
            logger.log(LoggerLevel.NORMAL, "Total: " + result);
        }
        while (operator != '!');
    }

}
