// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
   func arrayPairSum(_ nums: [Int]) -> Int {
        if nums == nil || nums.count == 0 {
            return 0
        }
        var nums2 = nums.sorted()
        var sum = 0
        var index = 0
        while index < nums2.count - 1 {
            sum += min(nums2[index],nums2[index+1])
            index += 2
        }
        return sum
    }