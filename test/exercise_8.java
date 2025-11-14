package sass;
public class exercise_8 {
    public static void main(String[] args) {

        int [] nums = {1,7,3,9,5};//array
        int average = 0;//val 4 avearge 
        int sum = 0;//val 4 sum of nums

        for(int i = 0; i < nums.length; i++) {//cycle 4 sum of nums
           sum = sum + nums[i];
         } 
         average = sum / nums.length;//average num calcs
         System.out.println("there is the summ of numbers: " + sum);//print sum
         System.out.println("there is the average of numbers: " + average);//print average
    }

}

