#Time Complexity: All the steps (finding the decreasing element, finding the larger element, and reversing) are linear operations.The combined complexity is O(3n), which simplifies to O(n).
#Space Complexity: O(1), The same array is modified
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        #To find the breach, Breach: nums[i]<nums[i+1]
        while(i>=0 and nums[i]>=nums[i+1]):
            i-=1
        #If a breach is found
        if(i>=0):
            j = n-1
            #Swap the current element nums[i] with immediate bigger number than nums[i] in the sublist, i.e nums[i+1] is the current biggest so again iterating from end of the list will give us immediate biggest before we again reach nums[i+1]
            while(nums[i]>=nums[j]):
                j-=1
            # Swap without using third variable 
            nums[i],nums[j] = nums[j],nums[i]
        #Consider two pointers to reverse the sublist
        left, right = i+1, n-1
        while(left<right):
            nums[left],nums[right]=nums[right],nums[left]
            left+=1
            right-=1
                
                