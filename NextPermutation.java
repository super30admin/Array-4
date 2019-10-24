/*
The time complexity is O(N) and the space complexity is O(1).

Here the intuition is to start from the end of the array and find the first index where its value is lesser than the value after it.
It we dont find such index, then the number is of the highest possible permutation and its sorted in reverse order. So flip the array
to get the lowest possible permutation. Or if we found the dip index we search the next possible number which we can replace with
the number in dip index. So start from last find such index and swap the variables. Now, flip the subarray from dip+1 index to last index

Yes, the solution passed all the test cases in leet code.
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;

        //Find the dip index.
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        //If not found, just flip the array.
        if(i<0){
            i = 0; int j = n-1;
            while(i<j){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            }

            return;
        }

        // Else find the next number which can be replaced.
        int dip = nums[i]; int dipIndex = i;
        int j = n-1;
        while(nums[j]<=dip){
            j--;
        }

        //Replace dip number with that number.
        int temp = nums[j];
        nums[j] = nums[dipIndex];
        nums[dipIndex] = temp;

        j = n-1; dipIndex++;

        //Filp the sub array starting from dip+1 to n-1
        while(dipIndex<j){
            temp = nums[j];
            nums[j] = nums[dipIndex];
            nums[dipIndex] = temp;
            dipIndex++;
            j--;
        }

        return;
    }
}