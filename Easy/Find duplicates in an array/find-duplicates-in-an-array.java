//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
  
  public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        // Count the occurrences of each element in the array
        for (int i : arr) {
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        }
        
        // Find the elements with exactly 2 occurrences
        for (int i : mpp.keySet()) {
            if (mpp.get(i) >= 2) {
                al.add(i);
            }
        }
        
        // If there are no duplicates, add -1 to the list
        if (al.isEmpty()) {
            al.add(-1);
        }
        Collections.sort(al);
        return al;
    }

   }