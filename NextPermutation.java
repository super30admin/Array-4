//TC : O(n)
//SC : O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length==0) return;
        int n = nums.length;
//Step 1 : Find the element which is smaller then the next element
        int i = n-2;
        while(i>=0 && nums[i]>=nums[i+1] )
        {
            i--;
        }
//step 2 : find the just bigger element then that element we found
        int j =n-1;
        if(i>=0)
        {
            while(j>=0 && nums[i]>=nums[j])
                j--;

            swap(nums,i,j);
        }
//step 3 : reverse the array from the found element to the end
        reverse(nums,i+1,n-1);

    }
    public void swap(int[] nums,int l,int r)
    {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
    public void reverse(int[] nums,int l, int r)
    {
        while(r>=l)
        {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            r--;
            l++;
        }
    }
}