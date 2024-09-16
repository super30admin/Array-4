package s30.arrays.arrays4;


//Algo: Kadane's algo, at every index we have two choices,
// to include the curr element or start a new subArray from that index

//TC: O(n);
//SC: O(1);
public class MaximumSubArray {


    public int maxSubArray(int[] nums) {

        int currMax = nums[0];
        int currSum = nums[0];

        for(int i=1; i < nums.length; i++){

            currSum =  Math.max( currSum + nums[i], nums[i]);
            currMax = Math.max(currMax, currSum);

        }


        return currMax;

    }
    public static void main(String[] args) {

    }
}
