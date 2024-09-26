// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
    func maxSubArray(_ nums: [Int]) -> Int {
        if nums == nil ||  nums.count == 0 {
            return 0
        }
        var maxSum = Int.min
        var sum = 0
        for i in  0..<nums.count {
            sum = sum + nums[i]
            if sum < nums[i] {
                sum = nums[i]
            }
            if sum > maxSum {
                maxSum = sum
            }
        }
        return maxSum
    }