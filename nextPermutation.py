#Algorithm:
#Find the breach
#FInd the lowest number to swap the current brechy number start from end
#Reverse the number from breach to end
#Time Complexity: O(n)
#Space Complexity: O(n)
def nextPermutation(self, nums: List[int]) -> None:
    if nums is None or len(nums)==0:
        return
    n = len(nums)
    i = len(nums)-2
    while i >=0 and nums[i]>nums[i+1]:
        i = i - 1
    if i >= 0:
        j = n -1
        while nums[i] >= nums[j]:
            j = j - 1
        self.swap(nums,i,j)
    self.reverse(nums,i+1,n-1)
    
def swap(self,nums,a,b):
    temp = nums[a]
    nums[a] = nums[b]
    nums[b] = temp

def reverse(self,nums,l,r):
    while (l < r):
        self.swap(nums,l,r)
        l= l +1
        r = r - 1