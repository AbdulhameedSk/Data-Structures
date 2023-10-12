//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        //System.out.println(Arrays.toString(arr));
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int count=0,sum=0;
        mpp.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(mpp.containsKey(sum)){
                count+=mpp.get(sum);
                mpp.put(sum,mpp.get(sum)+1);
            }
            else{
                mpp.put(sum,1);
            }
            
        }
        return count;
    }
}