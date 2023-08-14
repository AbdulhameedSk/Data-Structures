class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x=new int[n];
        int[] y= new int[n];
        for(int i=0;i<n;i++){
            x[i]=nums[i];
        }int c=n;
        for(int k=0;k<n;k++){
            y[k]=nums[c++];
        }int q=0;
        for(int i=0;i<n;i++){
        System.out.println(x[i]);}
        for(int i=0;i<n;i++){
        System.out.println(y[i]);}
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                nums[i]=x[i/2];
            }
            else if(i%2!=0){
                nums[i]=y[q++];
            }
        }
        return nums;
    }
}