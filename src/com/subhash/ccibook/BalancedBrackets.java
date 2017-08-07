import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        if(expression == null || expression.length()==0){
            return true;
        }
        
        char[] charArray = expression.toCharArray();
        Stack stack = new Stack();
        for(int i=0 ;i < charArray.length ; i++){
            if( isOpeningBrace(charArray[i]) ){
                stack.push(charArray[i]);
            } else if(charArray[i] == ')'){
                if(stack.isEmpty()){
                    return false;
                } else{
                    
                }
            }
        }
        
    }
    
    private isOpeningBrace(char c ){
        if(c == '{' || c=='(' || c=='[' ){
            return true;
        }else{
            return false;
        }
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
