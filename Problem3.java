//Next Permutation
//tc - O(n)
//sc - O(1)

public class Problem3 {
    public static void main(String[] args){
        Problem3 p = new Problem3();
        int[] nums = {1,2,3};
        p.nextPermutation(nums);
        for(int i : nums){
            System.out.print(i+" ");

        }

    }
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int n = nums.length;
        int t = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                t = i;
            }
            
        }
        //step - 2 find the index which is greater than value at t
        // System.out.println(t);
        if(t != -1){
            for(int j = n-1; j>=0; j--){
                if(nums[j] > nums[t]){
                    swap(nums, j, t);
                    break;
                }
            }
        }
        //step - 3 reverse from t+1 and n-1
        reverse(nums, t+1, n-1);
    }
    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int i, int j){
        while(i <= j){
            swap(nums, i , j);
            i++;
            j--;
        }
    }
}
