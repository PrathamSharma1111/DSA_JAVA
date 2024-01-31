// Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

// Note:-

// If the strings are anagrams you have to return True or else return False

// |s| represents the length of string s.


// Example 1:

// Input:a = geeksforgeeks, b = forgeeksgeeks
// Output: YES
// Explanation: Both the string have same characters with
//         same frequency. So, both are anagrams.
// Example 2:

// Input:a = allergy, b = allergic
// Output: NO
// Explanation: Characters in both the strings are 
//         not same, so they are not anagrams.

import java.util.Arrays;

public class Anagram {
     public static boolean isAnagram(String a,String b)
    {
         if(a.length()==b.length()){
            String N="NO";
            char ch1[] = a.toCharArray();
            char ch2[]=b.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
               return true;
            }else{
                return false;
            }
        }
         return false;
        
    }
    public static void main(String[] args) {
        String S1="geeksforgeeks";
        String S2="forgeeksgeeks";
        System.out.println(isAnagram(S1, S2));
    }
}
