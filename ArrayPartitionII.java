import java.util.Arrays;

public class ArrayPartitionII {
    public static int arrayPartitionMax(int[] nums){
        Arrays.sort(nums);
        int maxSum = 0;
        for(int i =0; i<nums.length; i+=2){
            maxSum = Math.max(maxSum, Math.min(nums[i], nums[i+1]));
        }
        return maxSum;
    }

    public static void main(String[] args){
        int nums[] = {1,4,2,3};

        System.out.println("Maximum Sum using minimum number from pair: "+ arrayPartitionMax(nums));
    }
}
