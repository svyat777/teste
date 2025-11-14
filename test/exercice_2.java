package sass;
import java.util.Scanner;

public class exercice_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean user_answer = false;

        while (user_answer == false) {//cycle for right password and username 
            System.out.print("enter your username: ");//ask user for username
            String  user_name = input.nextLine(); 
            
            System.out.print("enter your password: ");//ask user for pass
            String  user_pass = input.nextLine(); 

            if(!user_name.equals(user_pass)){//compares username and pass if they r the same
                System.out.println("your name is: " + user_name);
                System.out.println("your password is: " + user_pass);
                user_answer = true;
                
            }else{
                System.out.println("password and username cant be the same please write another one: ");//error
            }
       }

    }


}

