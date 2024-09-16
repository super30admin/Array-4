//Time complexity: O(nlgn)
//space complexity:O(1)
import java.util.Arrays;
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        Arrays.sort(nums);
        int sum=0;
        for(int i=nums.length-2;i>=0;i=i-2){
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String args[]){
        ArrayPartition obj=new ArrayPartition();
        int nums[]={1,4,3,2};
        System.out.println(obj.arrayPairSum(nums));
    }
    
}
