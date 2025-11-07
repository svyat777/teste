package sass;
public class exercise_8 {
    public static void main(String[] args) {

        int [] nums = {1,7,3,9,5};
        int average = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
           sum = sum + nums[i];
         } 
         average = sum / nums.length;
         System.out.println("there is the summ of numbers: " + sum);
         System.out.println("there is the average of numbers: " + average);
    }

}
