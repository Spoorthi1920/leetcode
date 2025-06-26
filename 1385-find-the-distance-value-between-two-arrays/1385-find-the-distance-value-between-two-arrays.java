class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);    
        int distance = 0;
        
        for (int val : arr1) {
            if (nBi(arr2, val - d, val + d)) {
                distance++;
            }
        }    
        
        return distance;
        
    }
     private static boolean nBi(int[] a, int f, int t) {
        int s = 0;
        int e= a.length - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] >= f && a[mid] <= t) {
                return false;
            } else if (a[mid] < f) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        
        return true;
    }
}