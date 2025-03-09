class Sample{
    /************PROBLEM-1*****************/
    //TC:0(NLOGN)
//SC:0(1)
    class Solution {
        public int arrayPairSum(int[] nums) {
            if(nums==null || nums.length==0){
                return 0;
            }
            int total=0,n=nums.length;
            Arrays.sort(nums);
            for(int i=0;i<=n-2;i=i+2){
                int min=Math.min(nums[i],nums[i+1]);
                total+=min;
            }
            return total;
        }
    }

    /************************PROBLEM-2******************/
    //TC:0(N)
//SC:0(1)
    class Solution {
        public int maxSubArray(int[] nums) {
            if(nums==null || nums.length==0){
                return 0;
            }
            int max=nums[0],rSum=nums[0],n=nums.length;
            for(int i=1;i<n;i++){
                rSum=Math.max(rSum+nums[i],nums[i]);
                max=Math.max(max,rSum);
            }
            return max;
        }
    }

/*******************PROBLEM-3*****************/
    //TC:0(N)
//SC:0(1)
    class Solution {
        public void nextPermutation(int[] nums) {
            if(nums==null || nums.length==0){
                return;
            }
            int n=nums.length;
            int i=n-2;

            //1.Find an index at which element is smaller than its right neighbour
            while(i>=0 && nums[i]>=nums[i+1]){
                i--;
            }
            //2.Find an element to the right which is just greater than j
            if(i!=-1){
                int j=n-1;
                while(j>i && nums[j]<=nums[i]){
                    j--;
                }
                swap(nums,i,j);
            }
            //3.Reverse from i to the end
            reverse(nums,i+1,n-1);

        }
        private void swap(int[] nums,int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        private void reverse(int[] nums,int left,int right){
            while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
    }
}