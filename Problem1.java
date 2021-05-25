import java.util.Arrays;

////Array Partition 
//tc - O(nlogn)
// sc- O(1)

class Problem1{
    public static void main(String[] args) {
        Problem1 p = new Problem1();
        int[] nums = {6,2,6,5,1,2};
        System.out.println(p.arrayPairSum(nums));
    }
    public int arrayPairSum(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;

        }
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0;i< nums.length; i+=2){
            sum += nums[i];

        }
        return sum;
    }
}