// Time : O(n)
// Space : O(1)
// LeetCode: Yes
// Approach:
// 1. Start from end and traverse till current element is greater than its previous element i.e nums[i] should be greater than nums[i-1].
// 2. Now again have another pointer at end and traverse till you find a element greater than pointer 1's previous element. i.e nums[ptr2] > nums[ptr1-1
//    and swap values at ptr2 and ptr1-1.
// 3. Now reverse array from ptr1 to end of array.
public class nextPermutation {
    public void nextPermutation(int[] nums) {
        int ptr1 = nums.length-1;
        while(ptr1>0 && nums[ptr1]<=nums[ptr1-1])   ptr1--;
        if(ptr1>0){
            int ptr2 = nums.length-1;
            while(nums[ptr2] <= nums[ptr1-1])   ptr2--;
            swap(nums,ptr2,ptr1-1);
        }
        reverse(nums,ptr1,nums.length-1);
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
