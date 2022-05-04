//Time Complexity O(N)
//Space Complexity O(1)
//Leetcode tested

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null) return;
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        int j = n-1;
        if(i>=0){
            while (nums[j]<=nums[i]){
                j--;
            }
            swap(nums,j,i);
        }
        reverse(nums,i+1,n-1);
    }
    private void reverse(int[] num,int l,int r){
        while (l < r){
            swap(num,l,r);
            l++;r--;
        }
    }
    private void swap(int num[],int l,int r){
        int temp = num[l];
        num[l] = num[r];
        num[r] = temp;
    }

}
