function maxSubArray(nums: number[]): number {
	if (!nums || nums.length === 0) return 0;

	let max = -Infinity;
	let curr = 0;

	// to track global maximum subarray
	let globalMaxStart = 0;
	let globalMaxEnd = 0;

	// to track current maximum subarray
	let currentMaxStart = 0;

	for (let i = 0; i < nums.length; i++) {
		const num = nums[i];

		// if the curr num is > curr+ sum, update curr
		if (num > curr + num) {
			// start a new subarray at the current index 'i'
			curr = num;

			currentMaxStart = i; // new subarray starts here
		} else {
			// extend current subarray
			curr = curr + num;
		}

		// update global max if current subarray sum is higher
		if (curr > max) {
			max = curr;
			globalMaxStart = currentMaxStart; // update the start index
			globalMaxEnd = i; // update the end index
		}
	}
	// console.log(
	// 	`max subarray start index: ${globalMaxStart}, end index: ${globalMaxEnd}`
	// );
	return max;
}
