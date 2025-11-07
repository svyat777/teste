package sass;

import java.util.Scanner;

public class exercice_4nd5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            int populationA = population(input, "Enter population of country A: ");
            double rateA = rate(input, "Enter growth rate of country A (in %): ");
            int populationB = population(input, "Enter population of country B: ");
            double rateB = rate(input, "Enter growth rate of country B (in %): ");

            int years = 0;
            double popA = populationA;
            double popB = populationB;

            while (popA < popB) {
                popA += popA * rateA / 100;
                popB += popB * rateB / 100;
                years++;
            }

            System.out.println("It will take " + years + " years for population A to reach or exceed population B.");
            
            System.out.print("Do you want to do one more time? (y/n): ");
            String answer = input.next();
            repeat = answer.equalsIgnoreCase("y");
            input.nextLine(); 
        }

        input.close();

    }

    
    public static int population(Scanner input, String message) {
        int value;
        while (true) {
            System.out.print(message);
            if (input.hasNextInt()) {
                value = input.nextInt();
                if (value > 0) break;
                else System.out.println("Error: enter a positive number.");
            } else {
                System.out.println("Error: enter a valid number.");
                input.next(); 
            }
        }
        return value;
    }

    public static double rate(Scanner input, String message) {
        double value;
        while (true) {
            System.out.print(message);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                if (value >= 0) break;
                else System.out.println("Error: enter a positive number.");
            } else {
                System.out.println("Error: enter a correct number.");
                input.next(); 
            }
        }
        return value;
    }
}
