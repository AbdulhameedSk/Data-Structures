//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    void rearrange(int arr[], int n) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Separate positive and negative numbers
        for (int i : arr) {
            if (i < 0) {
                q1.add(i);
            } else {
                q2.add(i);
            }
        }

        int i = 0;

        // Fill the arr array alternately from q2 and q1
        while (!q2.isEmpty() || !q1.isEmpty()) {
            if (!q2.isEmpty()) {
                arr[i++] = q2.poll();
            }
            if (!q1.isEmpty()) {
                arr[i++] = q1.poll();
            }
        }
    }
}
