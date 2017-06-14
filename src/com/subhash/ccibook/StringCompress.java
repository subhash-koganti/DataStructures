package com.subhash.ccibook;

public class StringCompress {

	public static void main(String[] args) {
		
		String str = "a";
		StringBuilder strbldr = new StringBuilder();
		int count =1;
		
		int a=0,b=0;
		
		while(a<str.length()){
			b=a+1;
			strbldr.append(str.charAt(a));
			while(b<str.length() && str.charAt(b) == str.charAt(a)){
				count++;
				b++;
			}
			strbldr.append(count);
			count =1;
			a = b;
		}
		
		System.out.println(strbldr.toString());
		
//		for(int i =0 ;i<str.length();i++){
//			count++;
//			if( i+1 == str.length() || str.charAt(i+1) != str.charAt(i) ){
//				strbldr.append(str.charAt(i));
//				strbldr.append(count);
//				count=0;
//			}
//		}
//		System.out.println(strbldr.toString());
	}
}
