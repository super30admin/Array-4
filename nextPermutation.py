#All TC on leetcode passed


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        #Here we find the next largest num by following below steps
        #Time complexity - O(n) where n is no. of digits
        #Space complexity - O(1)
        n = len(nums)

        #Find breach where nums are not in decsending order from reverse of the list
        i = n-2
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        
        #Once breach is found then find a digit which is greater than the digit at braeched position and swap them
        if i!=-1:
            j=n-1
            while nums[i]>=nums[j]:
                j-=1
            nums[i], nums[j] = nums[j], nums[i]
        else:
            return nums.reverse() #if no breach then we return the smallest num, the start num of permutation, since the given nums is last permutation
        
        #After swapping we reverse the digits from i+1 to end of nums 
        i = i+1
        j = n-1
        while i<=j:
            nums[i], nums[j] = nums[j], nums[i]
            i+=1
            j-=1
        
        return nums
        

        