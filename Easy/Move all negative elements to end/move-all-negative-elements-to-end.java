//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
            PrintWriter ot = new  PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            ot.print(a[i]+" ");
            
            ot.println();
        }
        ot.close();
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {

    public void segregateElements(int arr[], int n) {
        // Create a queue for positive elements
        Queue<Integer> q = new ArrayDeque<>();
        // Create an ArrayList to store negative elements
        ArrayList<Integer> al = new ArrayList<>();

        // Separate positive and negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                q.add(arr[i]); // Enqueue positive elements
            } else {
                al.add(arr[i]); // Add negative elements to the ArrayList
            }
        }

        int i = 0;
        // Dequeue positive elements and update the array
        while (!q.isEmpty()) {
            arr[i] = q.poll();
            i++;
        }

        // Add negative elements from the ArrayList to the array
        for (int num : al) {
            arr[i] = num;
            i++;
        }
    }
}
