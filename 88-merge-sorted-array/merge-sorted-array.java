class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[m];
        arr=Arrays.copyOf(nums1,m);
      //  System.out.println(Arrays.toString(arr));
        int i=0,j=0,k=0;
        while(i< m && j< n ){
            if(arr[i]<=nums2[j]){
                nums1[k]=arr[i];
                k++;
                i++;
            }
            else {
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            nums1[k]=arr[i];
            k++;
            i++;
        }


        while (j < n) {
            nums1[k] = nums2[j];
            k++;
            j++;
        }
    }
}