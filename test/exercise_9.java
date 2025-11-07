package sass;
public class exercise_9 {
    public static void main(String[] args) {

        int[] nums = new int[51];
        int rest = 0;

        for (int i = 1; i <= 50; i++) {
            nums[i - 1] = i;
        }

        for(int i = 0; i < nums.length; i++) {
            rest = nums[i]% 2;
           if(rest == 1){
            System.out.println(nums[i]);
           }
         } 
         
    }

}
