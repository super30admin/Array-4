//time complexity: O(N) where N is the length of array
//space complexity: O(1)
import  java.util.*;
public class NextPermutation {
    static void nextPermutation(int[] nums) {
        if(nums.length == 1) return;
        int len = nums.length;
        int index = -1;

        for(int i = len-2; i>= 0; i--) {
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            reverse(nums, 0, len-1);
            return;
        }
        int grt = 0;
        for(int i = len-1; i > index; i--) {
            if(nums[i] > nums[index]) {
                grt = i;
                break;
            }
        }
        swap(nums, index, grt);
        reverse(nums, index+1, len-1);
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,1,8,6,4,9,5,3,2,1};
        System.out.println("Number Array:" + Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println("Next Permutation Array:" + Arrays.toString(nums));
    }
}
