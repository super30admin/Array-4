##31. Next Permutation########################################################################################
// Time Complexity : n
// Space Complexity : O(1) -> no extra space just calculation for rolling hash
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no problem

// Your code here along with comments explaining your approach in three sentences only
First traverse the array form end to start and see if numbers are increasing the moment we find a number where it is less than previous number we found the index where discrepancy has happened. Now we will again traverse the list for end to index+1 to find a number that is greater than the number at index and replace than. And as final step we will reverse the number form index+1 to end


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        len1=len(nums)
        idx=-1
        #loop to find the index where inconsistency is found
        for i in range(len1-2,-1,-1):
            if nums[i]<nums[i+1]:
                idx=i
                #print('idx',idx)
                break
        #if inconsistency is out of range just reverse the numbers
        if idx==-1:
            self.rev(nums, 0, len1-1)
            return
        #loop through array form end to index+1
        for i in range(len1-1,idx,-1):
            #identify the number greater than number at index
            if nums[i]>nums[idx]:
                self.swap(nums, i, idx)
                #print(nums)
                self.rev(nums, idx+1, len1-1)
                return
    
    def rev(self,nums,l,r):
        #print(nums,l,r)
        while l<=r:
            nums[l],nums[r]=nums[r],nums[l]
            l+=1
            r-=1
    
    def swap(self,nums,l,r):
        nums[l],nums[r]=nums[r],nums[l]
        

        
        
