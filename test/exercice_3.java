package sass;
import java.util.Scanner;

public class exercice_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //set the values for functions 
        String user_name = Stringval(input, "Enter your name (more than 3 letters): ", 3);
        int user_age = intval(input, "Enter your age (0-150): ", 0, 150);
        double user_salary = doubleval(input, "Enter your salary (more than 0): ", 0);
        char user_sex = charval(input, "Enter your sex (f/m): ", new char[] {'f','m'});
        char user_status = charval(input, "Enter your marital status (s/m/w/d): ", new char[] {'s','m','w','d'});
        //printing the user values
        System.out.println("\nYour data:");
        System.out.println("Name: " + user_name);
        System.out.println("Age: " + user_age);
        System.out.println("Salary: " + user_salary);
        System.out.println("Sex: " + user_sex);
        System.out.println("Status: " + user_status);

        input.close();//closing the input
    }
//functions
    public static String Stringval(Scanner input, String message, int minLength) {//func 4 string value
        String value;
        while (true) {
            System.out.print(message);
            value = input.nextLine();
            if (value.length() >= minLength) break;//chechs if val is string
            System.out.println("Error: minimum length is " + minLength + " characters.");//error
        }
        return value;
    }

    public static int intval(Scanner input, String message, int min, int max) {//func 4 int value
        int value;
        while (true) {
            System.out.print(message);
            if (input.hasNextInt()) {//chechs if val is int
                value = input.nextInt();
                input.nextLine(); 
                if (value >= min && value <= max) break;
            } else {
                input.nextLine(); 
            }
            System.out.println("Error: enter a valid number between " + min + " and " + max + ".");//error
        }
        return value;
    }

   
    public static double doubleval(Scanner input, String message, double min) {//func 4 double value
        double value;
        while (true) {
            System.out.print(message);
            if (input.hasNextDouble()) {//chechs if val is double
                value = input.nextDouble();
                input.nextLine(); 
                if (value > min) break;
            } else {
                input.nextLine(); 
            }
            System.out.println("Error: enter a number greater than " + min + ".");//error
        }
        return value;
    }

   
    public static char charval(Scanner input, String message, char[] validChars) {//func 4 char 
        char value;
        while (true) {
            System.out.print(message);
            String line = input.nextLine();
            if (line.length() == 1) {//checks if value is char
                value = line.charAt(0);
                for (char i : validChars) {
                    if (i == value) return value;
                }
            }
            System.out.print("Error: enter one of ");//error
            for (char c : validChars) System.out.print(c + " ");
            System.out.println();
        }
    }
}

