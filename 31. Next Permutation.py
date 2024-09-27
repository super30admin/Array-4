'''
T = O(3n)
S = O(1)

Approach:
For the given list first find a breach in the list at when there is a breach in the gradient
Then from the breach point to the end of the array find a point at which there is a grater number and swap this number with the breeach
Reverse all the elements after the breach

if there is no breach then just reverse the list.

'''

class Solution:
    def reverse(self,l,start):
        n = len(l)
        s = start
        e = n-1
        print(s,s+(n-s)//2)
        for i in range(s,s+(n-s)//2):
            l[i],l[e] = l[e],l[i]
            e = e - 1
        return l
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        for i in range(len(nums)-1,-1,-1):
            if nums[i] > nums[i-1]:
                breach = i-1
                if breach != -1:
                    for j in range(len(nums)-1,breach,-1):
                        if nums[breach] < nums[j]:
                            nums[j],nums[breach] = nums[breach],nums[j]
                            return self.reverse(nums,breach+1)
                else:
                    return self.reverse(nums,breach+1)