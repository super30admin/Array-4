# Appoach 1:
# Time Complexity: O(n) just for nextPermutation function
# Space Complexity: O(1) just for nextPermutation function
class Solution:
    def generate_permutations(nums):   #O(n)
        n = len(nums)
        result = []

        def generate(k):        # O(n!) TC
            if k == 1:
                result.append(nums[:])
            else:
                generate(k - 1)
                for i in range(k - 1):
                    if k % 2 == 0:
                        nums[i], nums[k - 1] = nums[k - 1], nums[i]
                    else:
                        nums[0], nums[k - 1] = nums[k - 1], nums[0]
                    generate(k - 1)

        generate(n)
        return result

    def nextPermutation(self, nums: List[int]) -> List[int]:    # O(n) TC
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        # Find the largest index k such that nums[k] < nums[k + 1]
        k = -1
        for i in range(n - 1):
            if nums[i] < nums[i + 1]:
                k = i

        # If no such index exists, nums is already the last permutation
        if k == -1:
            nums.sort()
            return nums

        # Find the largest index l greater than k such that nums[k] < nums[l]
        l = -1
        for i in range(k + 1, n):
            if nums[k] < nums[i]:
                l = i

        # Swap nums[k] and nums[l]
        nums[k], nums[l] = nums[l], nums[k]

        # Reverse the sequence from nums[k + 1:]
        nums[k + 1:] = reversed(nums[k + 1:])


# ------------------------------------------------------------------------------------------------------
# Appoach 2:
# Time Complexity: O(n) * O(n) * O(nlogn) = O(n^2 log n)
# Space Complexity: O(1) 

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        p1 = n - 1
        p2 = p1 - 1

        while p2 >= 0:  #O(n) worst case
            if nums[p2] >= nums[p1]:
                if p2 == 0:
                    nums.sort()
                    return
                p2 -= 1
                p1 -= 1
            else:
                for i in range(n-1, p2, -1): #O(n) worst case
                    if nums[i] > nums[p2]:
                        nums[p2], nums[i] = nums[i], nums[p2]
                        nums[p2+1:] = sorted(nums[p2+1:])  #O(nlogn) worst case
                        return
                break


# ------------------------------------------------------------------------------------------------------
# Appoach 3:
# Time Complexity: O(n) 
# Space Complexity: O(1) 

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        p1 = n - 1
        p2 = p1 - 1

        while p2 >= 0 and nums[p2] >= nums[p1]:
            p2 -= 1
            p1 -= 1
        if p2 >= 0:
            n = len(nums) - 1
            while nums[n] <= nums[p2]:
                n -= 1
            self.swap(nums, p2, n)
        self.reverse(nums, p2 + 1, len(nums) - 1)
    
    def swap(self, nums, p1, p2):
        nums[p1], nums[p2] = nums[p2], nums[p1]
    
    def reverse(self, nums, left, right):
        while left < right:
            self.swap(nums, left, right)
            left += 1
            right -= 1
