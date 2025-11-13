class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # lets take an example 13542 
        # the next higher lexographical number is 14235
        # firstly if we look from the rigth to left 2<4<5 but at 3 5>3 so this is the position we can change to get pur next bigger number , lets call this pivot
        # now we need to swap it with the next smaller number to the right side of the pivot, [ smaller because we need the next permutation which is smallest of the largest elements to the rigth of the pivot]
        # in this case 4 is the smallest larger number than 3 so we swap it 14532 and then we need to swap our  right part of the pivot to get our next permutation which is 14,[235]-> 14235 

        # tc : O(n) , sc: O(1)

        # find pivot
        n = len(nums)
        i = n-1
        pivot = -1

        while i > 0 :
            if nums[i-1] < nums[i]:
                pivot = i-1
                break
            i = i-1
        
        # If no pivot found -> reverse entire array
        if pivot == -1:
            self.reverse(nums, 0, n - 1)
            return
        
        # if found, swap with the right side smallest larger number than pivot 
        j = n-1 
        while j > pivot:
            if nums[j] > nums[pivot]:
                self.swap(nums, j, pivot)
                break
            j -= 1
        
        # reverse the right side of the pivot array
        self.reverse(nums, pivot+1,n-1)

    def reverse(self, nums, l, r):
        while l < r:
            self.swap(nums, l, r)
            l += 1
            r -= 1

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        
    

