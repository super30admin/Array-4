# tc O(n), sc O(1).
currsum = 0
maxsum = float('-inf')

for num in nums:
    currsum = max(currsum+num, num)
    maxsum = max(maxsum, currsum)

return maxsum