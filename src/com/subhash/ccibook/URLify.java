package com.subhash.ccibook;

public class URLify {
	
	public static void main(String[] args) {
		
		String str = "abd chf    k ss ddd  sl";
		
		int trueLength = str.length();
		int spaceCount=0;
		int extLeng = 0;
		
		for(int i=0;i<trueLength;i++){
			if(str.charAt(i) == ' ' ){
				spaceCount++;
			}
		}
		extLeng = trueLength + (spaceCount*2);
		
		char[] arr = new char[extLeng];
		
		for(int i=0;i<trueLength;i++){
			arr[i] = str.charAt(i);
		}
		
		int index = extLeng -1;
		
		for(int i=0;i<extLeng;i++){
			System.out.print(arr[i]);
		}
		
		System.out.println("\n*****");
		for(int i=trueLength-1;i>=0;i--){
			if(arr[i] == ' '){
				arr[index--] = '0';
				arr[index--] = '2';
				arr[index--] = '%';
			}else{
				arr[index--] = arr[i];
			}
		}
		
		for(int i=0;i<extLeng;i++){
			System.out.print(arr[i]);
		}
		
	}

}
