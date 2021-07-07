// 53.
class Solution {
    public int maxSubArray(int[] nums) {
        //edge
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        //return twoPointers(nums);
        return kadaneAlgo(nums);
    }
    
    //time - O(n)
    //space - O(1)
    private int twoPointers(int[] nums) {
        int low = 0; //[low, high] is the current subarray
        int high = 0;
        int start = 0; //[start, end] is the sub array with max sum
        int end = 0;
        
        int currentSum = nums[0]; //sum of the current snippet
        int maxSum = nums[0]; //largest sum so far
        int current = 1; //iteration pointer
        
        while(current < nums.length) 
        {
            int currentElement = nums[current]; //get the current element
            //if current element is smaller than sum of current element and current sum, extend the current sub array and update current sum
            if(currentElement < currentSum + currentElement) 
            {
                high++; 
                currentSum = currentSum + currentElement;
            }
            //make current sub array covering just the current element and update current sum to current element value
            else
            {
                low = current;
                high = current;
                currentSum = currentElement;
            }
            //if current sum is above global max, update global max sum and respective pointers
            if(currentSum > maxSum)
            {
                start = low;
                end = high;
                maxSum = currentSum;
            }
            current++; //go to next element
        }
        
        System.out.println("Max Sum Sub Array is from index " + start + " to " + end);
        return maxSum;
    }
     
    //time - O(n)
    //space - O(n)
    private int kadaneAlgo(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0]; //max sum only for the 1st element is itself
        int maxSum = nums[0]; //updating value to global max sum
        for(int i = 1; i < nums.length; i++)
        {
            //at every index, extend(result[i - 1] + nums[i]) or try current alone(nums[i]), choose max and update global sum
            result[i] = Math.max(result[i - 1] + nums[i], nums[i]);
            if(maxSum < result[i])
            {
                maxSum = result[i];
            }
        }
        return maxSum;
    }
}
