// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
    if (!nums || !nums.length) return 0;
    
    const buckets = new Array(20001).fill(0);
    const sortedNums = [];
    let sum = 0;
    for (const num of nums) {
        buckets[num + 10000]++;
    }

    for (let i = 0; i < buckets.length; i++) {
        if (buckets[i] == 0) continue;
        
        while(buckets[i] > 0) {
            sortedNums.push(i - 10000);
            buckets[i]--;
        }
    }

    for (let i = 0; i < sortedNums.length; i += 2) {
        sum += sortedNums[i];
    }
    return sum;
};
