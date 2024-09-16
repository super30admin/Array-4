/*
Divide and Conquer Approach 

Time-> O(NlogN)
Space-> O(logN)
where N is # of elements in the array 

Passed All Test Cases 
*/

class Solution {
    public int maxSubArray(int[] nums) {
        //calling the helper function 
        return helper(nums,0,nums.length - 1) ; 
    }
    
    private int helper(int [] a, int l, int r) {
        //base case
        if(l == r) return a[l] ; 
        
        //finding the mid 
        int m = (l + r) / 2 ; 
        
        //recursive calls 
        int sumFromLeft = helper(a, l, m) ; 
        int sumFromRight = helper(a, m + 1, r); 
        
        //getting the cross sum 
        int crossSum = getCrossSum(a, l, r, m) ; 
        
        //finally returning the max of all threee
        return Math.max(Math.max(sumFromLeft, sumFromRight), crossSum) ; 
    }
    
    private int getCrossSum(int [] a, int l, int r, int m) {
        //edge case
        if(l == r) return a[l] ; 
        
        //getting the max Subsum from leftSum
        int sum = 0 ; 
        int leftSubSum  = Integer.MIN_VALUE ; 
        
        for(int i = m ; i > l - 1 ; i--) {
            sum += a[i] ; 
            leftSubSum = Math.max(sum, leftSubSum) ; 
        }
        
        
        //getting the max Subsum from rightSum
        sum = 0 ; 
        int rightSubSum = Integer.MIN_VALUE ; 
        
        for(int i = m + 1 ; i < r + 1 ; i++) {
            sum += a[i] ; 
            rightSubSum = Math.max(sum, rightSubSum) ; 
        }
        
        //returning sum of the leftsunsum and rightsubsum 
        return leftSubSum + rightSubSum ; 
    }
    
}


/*

Single Pass Approach 

Passed All Test Cases 

Time-> O(N)
Space -> O(1)
where N is # of elements in the array 

*/


class Solution {
    public int maxSubArray(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0) return 0 ; 
        
        //running sum 
        int sumSoFar = nums[0] ;
        
        //overall sum to be returned 
        int sum = nums[0] ; 
        
        //iterate over the array 
        for(int i = 1 ; i < nums.length ; i++) {
            
            //we get the greater of the current is greater or current + running sum 
            sumSoFar = Math.max(nums[i], nums[i] + sumSoFar) ; 
            
            //update our ans
            sum = Math.max(sum, sumSoFar) ; 
        }
        
        return sum ; 
    }
}