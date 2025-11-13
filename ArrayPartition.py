class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # to get the max output, if we club max elements together or min elements together, we will be acheiving max output, in contrary if we club a max and min element the max element is always eliminated thus givign the less output
        # approach : sort array and we can take the odd places values sum to get theoutput
        # Tc : O(nlogn), sc : O(1)
        nums.sort() # O(n)
        
        ans = 0
        for i in range(0,len(nums),2): # skipping one element every time
           ans+= nums[i]
           
        return ans