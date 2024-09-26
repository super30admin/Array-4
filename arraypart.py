class Solution:
    
    """
    Description: find maximum sum from given 2n integers which can form pairs of 2 and minimum value in each pair is used
    
    Time Complexity: O(n log n) for brute force
    Space Complexity: O(1)
    
    Approach:
    - Sort the array
    - sum every even index to reach maximum sum with minimum from each pair
    """
    
    def arrayPairSum(self, nums: List[int]) -> int:
        
        if nums == None: return 
        nums = sorted(nums)
        return sum([nums[i] for i in range(len(nums)) if (i + 1)%2 == 1])
