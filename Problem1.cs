// Time Complexity : O(n)
// Space Complexity : O(n) for frequency map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
I perform bucket sort on the given nums array. I also keep track of the minimum and maximum element of the array. I traverse from min to max element and check the frequencyMap for each of these
elements. At first I have set the skipNext flag to false. For each element, I check if the frequencyMap contains that particular element. If so, I check if skipNext is true and then reduce the frequency
of current number by 1 and set skip next to false. Then I update result as the frequencyMap value of that particular element / 2 * the element's value. Then if frequencyMap value is
odd for that element, I add one more value to the result equal to the element and set skipNext to true.
*/

public class Solution {
    public int ArrayPairSum(int[] nums) {
        Dictionary<int, int> frequencyMap = new();
        int max = nums[0];
        int min = nums[0];
        int result = 0;
        bool skipNext = false;

        for(int i = 0; i < nums.Length; i++)
        {
            frequencyMap[nums[i]] = frequencyMap.GetValueOrDefault(nums[i], 0) + 1;
            max = Math.Max(max, nums[i]);
            min = Math.Min(min, nums[i]);
        }

        for(int i = min; i <=max; i++)
        {
            if(frequencyMap.ContainsKey(i))
            {
                if(skipNext)
                {
                    frequencyMap[i] -= 1;
                    skipNext = false;
                }

                result += (frequencyMap[i] / 2) * i;

                if(frequencyMap[i] % 2 == 1)
                {
                    skipNext = true;
                    result += i;
                }
            }
        }

        return result;

    }
}