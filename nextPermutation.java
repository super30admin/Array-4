//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public void nextPermutation(int[] arr) {
        //1286931-->1289631-->1289136(ans)
        // find 1st decreasing element from the right
        int temp=0,i,min=Integer.MAX_VALUE,pivot=0,pos=0;
        for ( i=arr.length-1;i>=1;i--)
            if (arr[i]>arr[i-1])
            {
                pivot=i;break;
            }
        // find no. just larger than arr[pivot-1]
        if (pivot>0)//to check if there is a decreasing element to the left of pivot(i.e.pivot!=0)
        {
            for (i=pivot;i<arr.length;i++)
            {
                if (arr[i]>arr[pivot-1])
                    min=Math.min(min,arr[i]);
                if (min==arr[i])
                    pos=i;
            }
            //swap min and arr[pivot-1]
            swap(arr,pos,pivot-1);
        }

        //reverse from pivot to end
        int high=arr.length-1;
        while(pivot<=high){
            swap(arr,pivot,high);
            high--;pivot++;
        }
    }
    private void swap(int[] arr,int low,int high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
    }
}
