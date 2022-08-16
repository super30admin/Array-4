class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        '''
        Algorithm :
        Sort the array and add the first element while iterating in counts of 2
        Time = O(NlogN)
        Space = O(1)
        '''
        nums.sort()
        sum_ = 0 
        for i in range(0,len(nums), 2):
            print(i, nums[i])
            sum_ += nums[i] 
        return sum_
