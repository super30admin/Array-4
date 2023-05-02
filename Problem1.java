//Time -> O(n)
//Space -> O(1)

public class Problem1 {
    public int arrayPairSum(int[] nums) {
        int sum = 0; 
        for(int i = 0; i < nums.length; i=i+2){
            sum += nums[i];
        }
        return sum;
    }
}
