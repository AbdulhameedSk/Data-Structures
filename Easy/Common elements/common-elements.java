//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends



class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Use Sets to store unique elements
        Set<Integer> s1 = new LinkedHashSet<>();
        for (int i : A) {
            s1.add(i);
        }
        
        Set<Integer> s2 = new LinkedHashSet<>();
        for (int i : B) {
            s2.add(i);
        }
        
        Set<Integer> s3 = new LinkedHashSet<>();
        for (int i : C) {
            s3.add(i);
        }

        // Count the occurrences of elements
        for (int i : s1) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for (int i : s2) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for (int i : s3) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        // Find elements with count 3
        for (int i : mp.keySet()) {
            if (mp.get(i) == 3) {
                al.add(i);
            }
        }
        Collections.sort(al);
        return al;
    }
}
