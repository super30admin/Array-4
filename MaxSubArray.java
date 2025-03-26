
//TC-O(n) SC-O(1)
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int total=0; int idxx=0 ;int idxy=0;
        int result=nums[0];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(total<0){
                total=0; idxx=i;
            }
            total=total+num;
            if(total>result){
                idxy=i;
                result=Math.max(result,total);
            }

        }
        System.out.println(idxx+"====="+idxy);//gives the position of the index
        return result;
    }
}
