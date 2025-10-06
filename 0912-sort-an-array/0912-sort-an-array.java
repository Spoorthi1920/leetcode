class Solution { 
    public int[] sortArray(int[] nums) {
        int n = nums.length;
       if(nums == null || nums.length <= 1) {
            return nums;
        }
        //int [] temp = new int[n];
        mergesort(nums,0,n-1);
         return nums;
    }
    
    public static void mergesort(int [] nums,int low,int high){
        if(low>=high){
            return ;
        }
            int mid=(low+high)/2;
            mergesort(nums,low,mid);
            mergesort(nums,mid+1,high);
            merge(nums,low,high);
        
    }
    public static void merge(int []nums,int low,int high){
        int [] temp = new int[high-low+1];
        int mid = (low+high)/2;
        int p1=low,p2=mid+1,k=0;
        while(p1<=mid && p2<=high){
            if(nums[p1]<nums[p2]){
                temp[k++] = nums[p1++];
            }
            else
            temp[k++] = nums[p2++];
        }
        while(p1<=mid)
        temp[k++] = nums[p1++];
        while(p2<=high)
        temp[k++] = nums[p2++];
        for(int i=0;i<temp.length;i++){
            nums[low+i] = temp[i];
        }
    }
    
}