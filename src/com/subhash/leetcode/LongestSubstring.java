package com.subhash.leetcode;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        
        if(s==null || s.length()==0){
            return 0;
        }
        
        String res = "";
        int i=0,resLen=1;
        while(i < s.length()){
        	
        	if(res.length()>resLen){
            	resLen = res.length();
            }
        	
            if(!res.contains(""+s.charAt(i))){
                res = res + s.charAt(i);
                if(i+1 == s.length()){
                	break;
                }else{
                	i++;
                }
            }else{
                
                if(i+1 == s.length()){
                	break;
                }else{
                	res = ""+ res.charAt(res.indexOf(s.charAt(i))+1);
                	i++;
                }
            }
            System.out.println(res );
            
            
        }
        System.out.println(res );
        return resLen;
    }
    
    public static void main(String[] args) {
		String s = "dvdf";
		System.out.println("The answer is "+lengthOfLongestSubstring(s));
	}
}