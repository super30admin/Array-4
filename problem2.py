#Time Complexity = O(n)
#Space Complexity = O(n)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        first = -1
            
        i = len(nums)-1
        while(i>0):
            if(nums[i-1]<nums[i]):
                first = i-1
                break
            i-=1
        if(first!=-1):
            i = len(nums)-1
            while(i>first):
                if(nums[first]<nums[i]):
                    nums[i],nums[first] = nums[first],nums[i]
                    break
                i-=1
        l = first+1
        r = len(nums)-1
        while(l<r):
            nums[l],nums[r] = nums[r],nums[l]
            l+=1
            r-=1
                
        
        