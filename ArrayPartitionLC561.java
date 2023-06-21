class Solution {

    //Time Complexity: O(n*log(n))
    //Space Complexity: O(1)

    public int arrayPairSum(int[] nums) {

        if(nums == null || nums.length == 0) return 0;                  //check for null case
        
        Arrays.sort(nums);                                  //sort the array
        
        int sum = 0;                                //store the sum

        for(int i=0; i<nums.length; i+=2){          //iterate through nums array, increament the i by 2
            sum += nums[i];                         //getting the eleement from num and add it into the sum
        }
        return sum;                                 //return sum
    }
}
