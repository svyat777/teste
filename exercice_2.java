package sass;
import java.util.Scanner;

public class exercice_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean user_answer = false;

        while (user_answer == false) {
            System.out.print("enter your username: ");
            String  user_name = input.nextLine(); 
            
            System.out.print("enter your password: ");
            String  user_pass = input.nextLine(); 

            if(!user_name.equals(user_pass)){
                System.out.println("your name is: " + user_name);
                System.out.println("your password is: " + user_pass);
                user_answer = true;
                
            }else{
                System.out.println("password and username cant be the same please write another one: ");
            }
       }

    }


}
