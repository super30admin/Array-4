"""
The next permutation can be obtained by traversing the array from left to right. For example for [2,4,5] next
permutation is [2,5,4]. If numbers switched from the right to left then we get the biggest number.
The idea is to find the point of refernce at which we want to do the swapping to get the next permutation.
For example for [3,2,2,5,4,3,2] 2 at idx 2 is the point of reference.
The swapping of point of reference will be done with next bigger number than the reference point.
[3,2,3,   5,4,2,2] is this the next biggest number? No. reverse the 5,4,3,2.
The Next biggest number is [3,2,3,2,2,4,5]

if no point of reference then reverse the number.
"""


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # [3,2,2,5,4,3,2]
        #             ^
        flag = True
        # make sure you start from the 2nd last index
        # to avoid out of bound error
        for idx in range(len(nums) - 2, -1, -1):
            # find the reference point
            if nums[idx] < nums[idx + 1]:
                # swap reference point with the next greatest number
                # since the array to left of reference point is increasing order
                # find the first number greater than the reference point
                # make sure traverse from the end till reference point
                for i in range(len(nums) - 1, idx, -1):
                    if nums[i] > nums[idx]:
                        nums[i], nums[idx] = nums[idx], nums[i]
                        flag = False
                        break
                if not flag:
                    i, j = idx + 1, len(nums) - 1
                    while i <= j:
                        nums[i], nums[j] = nums[j], nums[i]
                        i += 1
                        j -= 1
                    break

        if flag:
            i, j = 0, len(nums) - 1
            while i <= j:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1
                j -= 1


class Solution_with_while:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        # it is better to you while loop here, because we need the
        # index at which reference point lies
        # make sure you start from the 2nd last index to avoid out of bound error
        idx = len(nums) - 2
        while idx >= 0 and nums[idx] >= nums[idx + 1]:
            idx -= 1

        # tells if reference point is found
        if idx >= 0:
            # swap with the next greatest number
            for i in range(len(nums) - 1, idx, -1):
                if nums[i] > nums[idx]:
                    nums[i], nums[idx] = nums[idx], nums[i]
                    break

        # reference point found or not found, need to reverse
        ptr1, ptr2 = idx + 1, len(nums) - 1
        while ptr1 < ptr2:
            nums[ptr1], nums[ptr2] = nums[ptr2], nums[ptr1]
            ptr1 += 1
            ptr2 -= 1







