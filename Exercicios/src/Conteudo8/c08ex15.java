package Conteudo8;

import java.util.Scanner;

public class c08ex15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = "", jobTitle = "", higherSalaryName = "", higherJobTilte = "";
        int n = 0, age, cont = 0;
        double salary, salaryUnderOrEquals18 = 0, average, higherSalary = 0;
        System.out.print("Employees number: ");
        n = console.nextInt();
        for (int i = 1; i <= n; i++) {
            console.nextLine();
            System.out.print("Name: ");
            name = console.nextLine();
            System.out.print("JobTitle: ");
            jobTitle = console.nextLine();
            System.out.print("Salary: ");
            salary = console.nextInt();
            System.out.print("Age: ");
            age = console.nextInt();

            if (salary > 10000 && age > 50) {
                System.out.println("SÊNIOR");
            }
            if (age <= 18) {
                salaryUnderOrEquals18 += salary;
                cont++;
            }
            if (salary > higherSalary) {
                higherSalary = salary;
                higherSalaryName = name;
                higherJobTilte = jobTitle;
            }
            System.out.println();
        }
        average = salaryUnderOrEquals18 / cont;
        System.out.print("\nThe average of salary in age under or equals to 18 is: " + average);
        System.out.println("\nThe employee with higher salary is: " + higherSalaryName + " and he(she) JobTitle is: "
                + higherJobTilte);
        console.close();
    }
}
