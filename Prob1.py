class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        #Method 1 - sort it out and get the even index numbers (min of the pairs)
        #TC - O(nlogn)
        nums.sort()
        # Initialize sum to zero
        max_sum = 0
        for i in range(0, len(nums), 2):
            # Add every element at even positions (0-indexed)
            max_sum += nums[i]
            
        return max_sum
        