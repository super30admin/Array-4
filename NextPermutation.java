package s30.arrays.arrays4;


//Algo: start from end and find where the sequence is disrupted. (should be in ascending order)
// once find the index, find the next bigger elements from the right part
// sort the right elements.


//TC: O(n)
//SC: O(1);
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2;

        while(i >=0){

            if(nums[i] < nums[i+1]){
                break;
            }

            i--;
        }

        if(i!=-1){
            int j = n-1;

            while(j > i){

                if(nums[j] > nums[i]) break;
                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i +1 ,n-1 );
    }


    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] =  temp;
    }

    private void reverse(int[] nums, int start, int end){

        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

    }
}
