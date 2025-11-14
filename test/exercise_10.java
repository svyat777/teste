package sass;
public class exercise_10 {
    public static void main(String[] args) {
        
        int number_1 = 4;//num 1
        int number_2 = 15; //num 2
        int sum = 0;// sum

        for(int i = 0; i <= number_2; i++) {//cycle 4 show integert between 2 nums and sum of them
            sum += number_1;
            i = number_1;
            System.out.print(i + " ");
            number_1++;
         }
         System.out.println("summ is: " + sum);
    }
}



