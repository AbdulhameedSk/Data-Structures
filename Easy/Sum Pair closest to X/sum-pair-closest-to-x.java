//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            System.out.print(ans[0]+" "+ans[1]);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int x) {
        // code here 
        int l=0,r=arr.length-1,min=Integer.MAX_VALUE,a1=0,a2=0;
        int[] nums=new int[2];
        // Arrays.sort(arr);
        while(l<r){
            int sum=arr[l]+arr[r];
            int relmin=Math.abs(x-sum);
            if(relmin<min){
                min=relmin;
                nums[0]=arr[l];
                nums[1]=arr[r];
            }
            if(sum<x){
                l++;
            }
            else if(sum>=x){
                r--;
            }
        }
        return nums;
    }
}