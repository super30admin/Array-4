#31. Next Permutation


# // Time Complexity : O(n) 
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No




class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse(i,m): # worst - O(n)
            while i <= m:
                nums[i], nums[m] = nums[m],nums[i]
                i+=1
                m-=1
        n = len(nums)
        i = n-1

        while i>0:   # O(n) -> once
            if nums[i-1] >= nums[i]: # checking from left for breach of gratest number that can be formed
                i-=1
                continue            # eg- 19 28 4321 ( breach -> 2< 8)
            elif nums[i-1] < nums[i]:
                j = n-1
                while (j>i-1): # O(n) -> once
                    if nums[i-1] < nums[j]: # check the imidiate greater dig
                        nums[j],nums[i-1] = nums[i-1] ,nums[j] # 19 [2] 8 4[3]21 swap 2 with 3 
                                                            # reverse 19[3]->84[2]21 ->19312248
                        reverse(i,n-1)
                        return
                    j-=1
        reverse(0,n-1)