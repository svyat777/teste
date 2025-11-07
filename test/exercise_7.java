package sass;
public class exercise_7 {
    public static void main(String[] args) {

        int [] nums = {1,7,3,9,5};
        int biggest_num = 0;

        for(int i = 0; i < nums.length; i++) {
           if(nums[i] > biggest_num){
            biggest_num = nums[i];
           }
         } 
         System.out.println(biggest_num);
    }

}
