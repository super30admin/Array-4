class Solution:
    # T.C. = O(N)
    # S.C. = O(1)
    # e.g. 6754321
    # Step 1 we identify the element that is smaller than it's right element(search from left to right)
    # ans: 6
    # Since that will be the number that once swapped will give us a bigger number
    # ans: 7
    # Step 2 we search for an element that is higher than the found element
    # Step 3 we swap the 2 elements
    # res = 7654321
    # Step 4 we reverse the array from the index+1 since that will give us the smallest next permutation
    # Note: here we don't swap because we placed 6 there, but rather from the next idx
    # to which we put the bigger element
    # res = 7123456
    def reverse(self,nums,l,r):
        while l<r:
            nums[l],nums[r]=nums[r],nums[l]
            l+=1
            r-=1

    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if((nums is None) or (len(nums)==0)):
            return
        index = -1
        size = len(nums)

        for i in reversed(range(size-1)):
            if  nums[i]<nums[i+1]:
                index = i
                break

        if index!=-1:
            for i in reversed(range(size)):
                if nums[i]>nums[index]:
                    nums[i],nums[index] = nums[index],nums[i]
                    break
        # Even if a swappable element is not found(i.e case when it is the last permutation)
        # it will just reverse the array giving us the first permutation
        self.reverse(nums,index+1,size-1)