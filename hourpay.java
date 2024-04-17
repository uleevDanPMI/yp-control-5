

import java.util.Scanner;

public class PaymentByHour extends Main {
    int workHours;
    double hourlyRate = 180.5;

    public void payOnHours() { // метод, который определяет зарплату по часам работы с фиксированной ставкой за час
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter work hours:");
        workHours = scanner.nextInt();
        if(workHours < 0 ) {
            throw new IllegalArgumentException("Error: workHours cannot be negative.");
        }

        double salaryOnHours = hourlyRate * workHours;
        System.out.println("Salary on hours: " + salaryOnHours);
    }
}
