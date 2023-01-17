#time complexity :O(n)
#space complexity:O(1)
#ran on leetcode: Yes
#find out the index from the end where the increasing order of integers is broken. From this index+1 till the end, find out the smallest number among all numbers that are greater than this number. Swap these 2 numbers and reverse the numbers from this index+1 till end.
class Solution:
    def rev(self,L,start,end):
        i=start
        j=end
        while(i<j):
            temp=L[i]
            L[i]=L[j]
            L[j]=temp
            i+=1
            j-=1

    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # 5,4,1,3,2
        i=len(nums)-1
        while(i>=1):
            if(nums[i] > nums[i-1]):
                break
            i-=1
        pos=i-1
        best=-1
        if(i==0):
            self.rev(nums,0,len(nums)-1)
            return
        while(i<len(nums)):
            if(nums[i]<=nums[pos]):
                break
            best=nums[i]
            i+=1
        temp=nums[pos]
        nums[pos]=nums[i-1]
        nums[i-1]=temp
        self.rev(nums,pos+1,len(nums)-1)



        
