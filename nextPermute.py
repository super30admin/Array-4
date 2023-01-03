'''
Time Complexity --> O(n)
Space Complexity --> O(1)
'''
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def rev_ls(nums, s, e):
            while s<e:
                tmp = nums[s]
                nums[s] = nums[e]
                nums[e] = tmp
                e-=1
                s+=1
        n = len(nums)
        left = 0
        right = n-2
        index = -1
        while left<=right:
            if nums[right]<nums[right+1]:
                index = right
                break
            else:
                right-=1
        #step 2 is to find a element from right to left which is just greater than index element
        #print(index)
        if index!=-1:
            #print('Yes')
            for i in range(n-1, -1, -1):
                if nums[i]>nums[index]:
                    tmp = nums[index]
                    nums[index] = nums[i]
                    nums[i] = tmp
                    break
        #step reverse the element from index+1 to last
        #print(nums)
        rev_ls(nums, index+1,n-1)
                