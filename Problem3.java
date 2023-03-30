/*
Next Permutation
approach:
1. from right to left check where curr element is less than curr+1
2. find a position on right of breach where element is less than= element at breach
3. now swap those 2 elements and reverse from breach to end to get next permutation of elements from breach to right
4. in case we don't find breach, just reverse entire array
time: O(n)
space: O(1)
 */
public class Problem3 {
    public void nextPermutation(int[] nums) {

        int n = nums.length, i = n-2;

        while(i>=0) {
            if(nums[i]<nums[i+1]) {
                int breach = i;
                int j = i+1;
                while(j<n && nums[breach]<nums[j]) {
                    j++;
                }
                j--;
                int t = nums[breach];
                nums[breach] = nums[j];
                nums[j] = t;
                reverse(nums, breach+1, n-1);
                break;
            }
            i--;
        }

        if(i==-1) reverse(nums, 0, n-1);

    }

    private void reverse(int[] n, int s, int e) {
        int i = s, j = e;

        while(i<=j) {
            int t = n[i];
            n[i] = n[j];
            n[j] = t;
            i++;j--;
        }

    }
}
