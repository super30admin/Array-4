'''
We want to have the smallest permutation that is bigger than the present permutation
so the smallest decimal we can change. So it is in our interest to start from the back.
if the number is bigger than all the previous numbers, then there's nothing we can
do about that decimal since swapping with a smaller number would give us a
smaller than number than our present permutation (if in the second decimal we have
a 2, then putting a 1 there won't be possible if we don't touch the numbers on the left).
So the first element we should swap is the first time it is smaller than an element (break
the ascending order). This means there's a number we could swap it with. Which one? We
take the smallest number that is bigger than that number. Once we've swaped these, 
we notice that on the right the numbers are in ascending order, we can just reverse
them since we made sure that the number will be bigger no matter what we do with 
the numbers on the right.
'''
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        idx=-1
        for i in range(len(nums)-1,0,-1): 
            if nums[i-1]<nums[i]:
                idx=i-1
                break
        if idx!=-1:
            for i in range(len(nums)-1,-1,-1):
                if nums[idx]<nums[i]:
                    nums[idx],nums[i]=nums[i],nums[idx]
                    break
        left,right=idx+1,len(nums)-1
        while left<right:
            nums[left],nums[right]=nums[right],nums[left]
            left,right=left+1,right-1     
