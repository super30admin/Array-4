//Inituition : At any given point , one number will be sarficied, so the best is to sort the numbers so that min numbers are reduced.

//Sort it : all min numbers will be the first half of the array , now the sum will be of the max numbers from the pairs. 

//tc: O (nlogn +n)
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i = 0 ; i < nums.length ; i +=2)
        {
            sum += nums[i]; // odd number will be the larger
        }
        
        return sum;
    }
        
}
