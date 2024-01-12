class Solution {
    
    private:
    void reverse(vector<int>& arr,int l, int r)
    {
        while(l<r)
        {
            swapHelper(arr,l,r);
            l++;
            r--;
        }
    }
    void swapHelper(vector<int>& arr,int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

public:
    void nextPermutation(vector<int>& nums) {
      int n = nums.size();
      int i = n-2;

      while(i>=0 && nums[i] > nums[i+1])
      {
          i--;
      }
          if(i>=0)
          {
              int j = n-1;
              while(j>=0 && (nums[j]<=nums[i]) )
              j--;
              swapHelper(nums,i,j);
          }
          reverse(nums,i+1,n-1);
      }  
    

};