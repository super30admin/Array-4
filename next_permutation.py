# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def nextPermutation(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """

        n = len(nums)

        i = n - 1
        #         We are checking if current element is less than its previous number then we will reduce the pointer
        while i > 0 and nums[i - 1] >= nums[i]:
            i -= 1
        #         after loop if we reach to the start of the array we will just reverse the array
        if i == 0:
            nums.reverse()
            return
        #         If not then we will be getting the immediate next number from end of the array
        #         till current index and we will swap these two elements
        index = i - 1
        j = n - 1
        while nums[j] <= nums[index]:
            j -= 1

        nums[index], nums[j] = nums[j], nums[index]
        #         Now we will reverse the remaining numbers from index till end of the array
        left = index + 1
        right = n - 1

        while right > left:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1





