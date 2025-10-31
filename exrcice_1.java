package sass;
import java.util.Scanner;

public class exrcice_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean user_answer = false;

        while (user_answer == false) {
            System.out.print("enter number from 0 to 10: ");
            int user_number = input.nextInt(); 
            
            if(user_number < 0 || user_number > 10){
                System.out.println("please enter correct number! from 0 to 10: "); 
            }else{
                System.out.println(user_number);
                user_answer = true;
            }
       }

    }


}
