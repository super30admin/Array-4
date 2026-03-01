/**
 * @param {number[]} nums
 * @return {number}
 Intuition:
 Sort the numbers implicitly by counting frequency from min to max, so we process them in ascending order without an explicit sort.
 Pair the numbers consecutively in sorted order, always taking the smaller element of each pair.
 Add every first number in each pair (alternating with a flag), which maximizes the total sum of minimums.
 T.C: O(n)
 S.C: O(n)
 */
var arrayPairSum = function (nums) {
    let map = new Map();
    let min = nums[0];
    let max = nums[0];
    for (let num of nums) {
        min = Math.min(num, min);
        max = Math.max(num, max);
        let count = (map.get(num) || 0) + 1;
        map.set(num, count);
    }
    let flag = false;
    let result = 0;
    for (let i = min; i <= max; i++) {
        if (!map.has(i)) continue;
        let freq = map.get(i);
        while (freq > 0) {
            if (!flag) {
                result += i;
            }
            flag = !flag;
            freq--;
        }
        map.delete(i);
    }
    return result;
};