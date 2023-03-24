class Solution {



    //Time Complexity: O(n)
    //Space Complexity: O(1)
    
    public int maxSubArray(int[] nums) {
        
        if(nums == null || nums.length == 0) return 0;

        int maxSum = Integer.MIN_VALUE;                                     //maxSum is the resulting subarray sum
        int currentSum = 0;                                                 //currentSum is the sum of subarray till current

        //itearting through array
        for(int i=0; i < nums.length; i++){

            currentSum = Math.max(nums[i], currentSum + nums[i]);           // update currentSum by the maximum between incoming element or the past subarray sum plus incoming element
            maxSum = Math.max(currentSum, maxSum);                          // check which is greater, earlier maxSum or currentSum, update the maximum between those 2
        }
        return maxSum;
    }





    //if in the question, they asked about the start and end index of maximum subarray
    //Time Complexity: O(n)
    //Space Complexity: O(1)

    // public int maxSubArray(int[] nums) {
        
    //     if(nums == null || nums.length == 0) return 0;

    //     int maxSum = Integer.MIN_VALUE;                                     //maxSum is the resulting subarray sum
    //     int currentSum = 0;                                                 //currentSum is the sum of subarray till current
    //     int currentStart = 0;
    //     int start = 0;
    //     int end = 0;


    //     //itearting through array
    //     for(int i=0; i < nums.length; i++){

    //         if(nums[i] > currentSum + nums[i]){                             // check if the incoming element is greater then the past subarray sum plus incoming element

    //             currentSum = nums[i];                                       //if so, then update the currentSum by incoming element,and update the currentStart
    //             currentStart = i;
    //         }
    //         else{
    //             currentSum =  currentSum + nums[i];                         //if not, then add the incoming element to currentSum
    //         }

    //         if(currentSum > maxSum){                                        //check if currentSum is greater than the maxSum

    //             maxSum = currentSum;                                        //if so, then update the maxSum, update the start and end value
    //             start = currentStart;
    //             end = i;
    //         }
    //     }

    //     System.out.println("Start:" + start);
    //     System.out.println("End:" + end);

    //     return maxSum;
    // }


    



    //Time Complexity: O(n)
    //Space Complexity: O(1)

    // public int maxSubArray(int[] nums) {
        
    //     int maxSum = Integer.MIN_VALUE;
    //     int currentSum = 0;
        
    //     for(int i=0; i<nums.length; i++){
            
    //         currentSum += nums[i];
            
    //         maxSum = Math.max(maxSum, currentSum);
            
    //         //reseting the subarray
    //         if(currentSum<0){
    //             currentSum = 0;
    //         }
    //     }    
    //     return maxSum;
    // }
    
    


    
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    
//     public int maxSubArray(int[] nums) {
        
//         int maxSum = nums[0];
//         int currentSum = nums[0];
        
//         for(int i=1; i< nums.length; i++){
            
//             currentSum = Math.max(currentSum + nums[i], nums[i]);
            
//             maxSum = Math.max(currentSum, maxSum);
            
//         }
//         return maxSum;       
//     }
}
