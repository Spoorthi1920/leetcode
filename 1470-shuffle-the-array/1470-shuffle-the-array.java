class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int i=0;
        int k=0;
        int j=nums.length/2;
        //int t=j
        while(j<nums.length && i<j)
        {
            ans[k++] = nums[i++];
          //k++;
        //  i++;
          //.out.println(i+" "+a[i]);
            ans[k++] = nums[j++];
           //k++;
          // i++;
            //j++;
        }
        return ans;
        }
        }