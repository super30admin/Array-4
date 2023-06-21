/*
For Next permutation, we need to get the array, which is just bigger than orginal one using the same elements

1) Starting from the end of the array, check if element is smaller than prev one, if there is any element smaller than the prev one, then we would it a breach index

1.0) After we have the breach index, start from the end of the array , till the breach index, backwards. We need to find an element just bigger than the breach element
1.2) Swap the bigger element with the breach element
1.3) Next to the breach index, reverse the rest of the elements
1.4) we should have the next permutation now
2.0) if 1 fails,  then reverse the array, we should have the next permutation now
T:O(n)
S: O(1)
*/
class Solution {
    public void nextPermutation(int[] nums) {

        int breach = 0;
        boolean isBreach =false;

        for(int i = nums.length - 2; i>=0;i--){
            if(nums[i] < nums[i+1]){
                // breach found
                breach =i;
                isBreach = true;
                break;
            }
        }

        if(isBreach){

            // find the next bigger element and swapp
            nextBigElement(nums, breach);

            //reverse after the breach index
            rev(nums,breach+1, nums.length-1);
            return;
        }

        //reverse the array 
        rev(nums,0, nums.length-1);

    }

    // Start from the end till the original start, to find the next big element, then swap

    private void nextBigElement(int[] nums, int start){
        int element = nums[start];
        int origStart = start;

        int end = nums.length -1;
         int biggeridx = nums.length;
         int bigEl = Integer.MAX_VALUE;

        while(end > start){
            if(nums[end] > element && nums[end] < bigEl ){
                biggeridx = end;
                bigEl = nums[end];
            }
            end--;
        }

        if(biggeridx < nums.length){
            int temp = nums[start];
            nums[start] = nums[biggeridx];
            nums[biggeridx] = temp;
        }
    }
    // reverse the elemenst from start to end
    private void rev(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            end--;start++;
        }
    }
}