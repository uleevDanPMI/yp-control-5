package com.company;

import java.util.Scanner;

public class PaymentWithInterest extends Main {
    double dayIncome;
    double rate = 5.7;

    public void payOnRate() { // метод, который рассчитывает выплату по проценту от продаж за один день
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter daily income:");
        dayIncome = scanner.nextDouble();
        if(dayIncome < 0 ) {
            throw new IllegalArgumentException("Error: dayIncome cannot be negative");
        }

        double payRate = rate * dayIncome;
        System.out.println("Payment on rate: " + payRate);
    }
}
