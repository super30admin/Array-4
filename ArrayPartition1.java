/*
algorithm:
sort the array
initialise sum = 0 
Iterate each alternate element in the array and at each iteration add nums[i] to sum.
return sum;
time complexity : O(nlogn) + O(n) = O(nlogn)
space complexity : O(1)

*/
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums.length == 0 || nums == null)return 0;
        
        //sort the array
        Arrays.sort(nums);
        //take sum of each alternate index starting from index 0
        //this sum will be sum of all min element of pairs 
        int sum =0;
        int i = 0;
        while(i < nums.length){
            sum += nums[i];
            i+=2;
            
        }
        return sum;
    }
}