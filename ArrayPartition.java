//TC = O(N log N)
//SC = O(1)
/*
 * Array is sorted and then the minimum is taken from adjacent pairs and added to sum.
 */
import java.util.Arrays;

public class ArrayPartition
{
    public static int arrayPairSum(int[] nums)
    {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }

        Arrays.sort(nums);

        int sum =0;
        for(int i =0;i<nums.length-1;i+=2)
        {
            sum+= Math.min(nums[i],nums[i+1]);
        }

        return sum;
    }

    public static void main(String args[])
    {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
}