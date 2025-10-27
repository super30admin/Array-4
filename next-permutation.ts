// Time Complexity: O(n)
// Space Complexity: O(1)
function nextPermutation(nums: number[]): void {
	let n = nums.length;
	let i = nums.length - 2;

	// find the index for the first decreasing digit from the end
	while (i >= 0 && nums[i] >= nums[i + 1]) {
		i--;
	}

	let j = n - 1;

	// if i < 0 , then rray is already in descending order,
	// if i >= 0, find the smallest element which is just greater than nums[i], and replace it with nums[i]
	if (i >= 0) {
		while (j >= i && nums[i] >= nums[j]) {
			j--;
		}
		// Swap nums[i] and nums[j]
		[nums[i], nums[j]] = [nums[j], nums[i]];
	}

	// reverse the suffix starting from i + 1.
	// since nums[i+1...n-1] was in descending order,
	// reversing it puts it in ascending order, gives us next permutation (lexicographically smallest after the new nums[j])
	reverse(i + 1, n - 1);

	function reverse(i: number, j: number) {
		while (i < j) {
			[nums[i], nums[j]] = [nums[j], nums[i]];
			i++;
			j--;
		}
	}
}
