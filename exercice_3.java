package sass;
import java.util.Scanner;

public class exercice_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user_name = Stringval(input, "Enter your name (more than 3 letters): ", 3);
        int user_age = intval(input, "Enter your age (0-150): ", 0, 150);
        double user_salary = doubleval(input, "Enter your salary (more than 0): ", 0);
        char user_sex = charval(input, "Enter your sex (f/m): ", new char[] {'f','m'});
        char user_status = charval(input, "Enter your marital status (s/m/w/d): ", new char[] {'s','m','w','d'});

        System.out.println("\nYour data:");
        System.out.println("Name: " + user_name);
        System.out.println("Age: " + user_age);
        System.out.println("Salary: " + user_salary);
        System.out.println("Sex: " + user_sex);
        System.out.println("Status: " + user_status);

        input.close();
    }

    public static String Stringval(Scanner input, String message, int minLength) {
        String value;
        while (true) {
            System.out.print(message);
            value = input.nextLine();
            if (value.length() >= minLength) break;
            System.out.println("Error: minimum length is " + minLength + " characters.");
        }
        return value;
    }

    public static int intval(Scanner input, String message, int min, int max) {
        int value;
        while (true) {
            System.out.print(message);
            if (input.hasNextInt()) {
                value = input.nextInt();
                input.nextLine(); 
                if (value >= min && value <= max) break;
            } else {
                input.nextLine(); 
            }
            System.out.println("Error: enter a valid number between " + min + " and " + max + ".");
        }
        return value;
    }

   
    public static double doubleval(Scanner input, String message, double min) {
        double value;
        while (true) {
            System.out.print(message);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                input.nextLine(); 
                if (value > min) break;
            } else {
                input.nextLine(); 
            }
            System.out.println("Error: enter a number greater than " + min + ".");
        }
        return value;
    }

   
    public static char charval(Scanner input, String message, char[] validChars) {
        char value;
        while (true) {
            System.out.print(message);
            String line = input.nextLine();
            if (line.length() == 1) {
                value = line.charAt(0);
                for (char i : validChars) {
                    if (i == value) return value;
                }
            }
            System.out.print("Error: enter one of ");
            for (char c : validChars) System.out.print(c + " ");
            System.out.println();
        }
    }
}
