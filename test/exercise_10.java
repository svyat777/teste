package sass;
public class exercise_10 {
    public static void main(String[] args) {
        
        int number_1 = 4;
        int number_2 = 15; 
        int sum = 0;

        for(int i = 0; i <= number_2; i++) {
            sum += number_1;
            i = number_1;
            System.out.print(i + " ");
            number_1++;
         }
         System.out.println("summ is: " + sum);
    }
}


