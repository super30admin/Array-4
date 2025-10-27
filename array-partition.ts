// Time Complexity: nlog(n)
// Space Complexity: O(1)
function arrayPairSum(nums: number[]): number {
	const n = nums.length;

	// sort the array (nlog(n))
	nums.sort((a, b) => a - b);

	let result = 0;
	// iterate through elements at even index to count max possible array partition sum
	// since the array is already sorted, we can take sum of numbers at even indexes to get the max sum for any pair
	for (let i = 0; i < n; i = i + 2) {
		result += nums[i];
	}
	return result;
}
