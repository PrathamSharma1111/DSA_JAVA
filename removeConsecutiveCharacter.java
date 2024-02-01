// Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

// Example 1:

// Input:
// S = aabb
// Output:  ab 
// Explanation: 'a' at 2nd position is
// appearing 2nd time consecutively.
// Similiar explanation for b at
// 4th position.

// Example 2:

// Input:
// S = aabaa
// Output:  aba
// Explanation: 'a' at 2nd position is
// appearing 2nd time consecutively.
// 'a' at fifth position is appearing
// 2nd time consecutively.

public class removeConsecutiveCharacter {
    public static String removeCharacter(String S){
        String result="";
   char[] Str= S.toCharArray();
   for(int i=1;i<Str.length;i++){
       if(Str[i]==Str[i-1]){
          Str[i-1]='0'; 
       }
   }
   for(int i=0;i<Str.length;i++){
       if(Str[i]!='0'){
          result+=Str[i]; 
       }
   }
   
   return result;
}
public static void main(String[] args) {
    String S = "aabaa";
    String S2=removeCharacter(S);
    System.out.println(S2);
}
}
