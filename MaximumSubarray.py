class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # kadnes algorithm 
        # keep moving the pointers in the arr and keep track of the curr arr is this sum includign with previous subarray is max or just by taking thisgives us max , keep track of it in curr_arr
        # max, if this sub arr giving us max or the previous sub arr was max, keep track of it, we will be movign to the end of the arra with proper output

        # tc : o(n), sc : O(1)

        
        curr_arr = nums[0]
        max_sum = nums[0]
        
        for num in nums[1:]:
            curr_arr = max(num, curr_arr+num)
            max_sum = max(max_sum, curr_arr)
            
        return max_sum