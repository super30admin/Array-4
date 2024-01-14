//TC : O(n)
//SC: O(1)
public class NextPermutation {
    public void nextPermutation(int[] nums) {
      int change =-1;

      for(int i= nums.length-1; i>0; i--){
        if(nums[i-1]< nums[i]){
          change =i-1;
          break;
        }
      }

      for(int i= nums.length-1; change != -1 && i>change; i--){
        if(nums[change]< nums[i]) {
          swap(nums, change, i);
          break;
        }
      }

      int l = change + 1;
      int r = nums.length-1;
      while(l<r){
        swap(nums, l, r);
        l++;
        r--;
      }
    }

    private void swap( int[] nums, int a, int b){
      int t = nums[a];
      nums[a]= nums[b];
      nums[b] = t;
    }

  }
