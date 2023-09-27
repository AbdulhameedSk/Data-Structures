//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        // Reverse the string str
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stb.append(st.pop()); // Append the character popped from the stack
        }
        String reversedStr = stb.toString(); // Convert StringBuilder to String
        return reversedStr;
    }
}