# tc O(n), sc O(1).
def reverse(i, j):
    while i < j:
        nums[i], nums[j] = nums[j], nums[i]
        i += 1
        j -= 1

idx = len(nums) - 2
while idx >= 0 and nums[idx] >= nums[idx+1]:
    idx -= 1
if idx == -1:
    reverse(0, len(nums) - 1)
else:
    j = idx+1
    while j < len(nums) and nums[j] > nums[idx]:
        j += 1
            
    j = j - 1
    nums[idx], nums[j] = nums[j], nums[idx]

    # swap from idx+1 to end
    reverse(idx+1, len(nums) - 1)