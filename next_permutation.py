"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
Algorithm Explanation
Bruteforce - Finding all the permutations using backtracking and finding the 
next highest permutation based on comparing the digits in the number

Optimal 
Intuition
- To find the position of digit in the number from where next higher digit 
can be obtained and since the number increases from the right, we check from
the right to find the first point where digit at current position is more than 
the one at position to the right. -> digit at p1
Thereafter, we find the digit which is immediate higher than current obtained
digit ->digit at p2 
-Swap the digits
- Reverse the digits occuring after the p1 in the array
"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        N = len(nums)
        i,j = N-2,N-1
        
        #Get the digit at p1 
        while i >=0 and nums[i] >= nums[i+1]:
            i-=1
        
        #Get the digit at p2
        while j >=0 and i>=0 and nums[j] <= nums[i]:
            j-=1
        
        #swap p1 and p2 digits
        nums[i],nums[j] = nums[j],nums[i]
        
        #reverse p1+1 to end
        nums[i+1:] = reversed(nums[i+1:])