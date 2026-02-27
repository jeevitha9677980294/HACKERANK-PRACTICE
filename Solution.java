import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {

       
        a = a.toLowerCase();
        b = b.toLowerCase();

        
        if (a.length() != b.length()) {
            return false;
        }

     
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        boolean result = isAnagram(a, b);

        if(result)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
