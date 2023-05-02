class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        #find the first point of breach, swap it with the next bigger number of the breach and reverse the remaining,IF THE NUMS IS ALREADY MAX possible number, breach is not found, so no need to replace and directly reverse the list
        #TC-O(n),sc-O(1)
        breach = -1
        for i in range(len(nums)-2,-1,-1):
            if nums[i]<nums[i+1]:
                breach=i
                break
        if breach!=-1:
            #replace 
            for i in range(len(nums)-1,breach,-1):
                if(nums[i]>nums[breach]):
                    nums[i],nums[breach]=nums[breach],nums[i]
                    break
        #reverse from breach+1
        start=breach+1
        end=len(nums)-1
        while(start<=end):
            nums[start],nums[end]=nums[end],nums[start]
            start+=1
            end-=1
        



        