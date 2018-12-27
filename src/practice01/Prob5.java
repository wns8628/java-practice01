package practice01;

import com.sun.xml.internal.ws.util.StringUtils;

public class Prob5 {

	public static void main(String[] args) {

		String[] tsn = new String[100];
		
		for(int i=0; i< 100; i++) {
		   tsn[i] = Integer.toString(i);
		   
		   if(countCharacter(tsn[i],"3")==1 || countCharacter(tsn[i],"6")==1 || countCharacter(tsn[i],"9")==1) {
			   System.out.println(tsn[i]+" 짝");   
		   };
		   if(countCharacter(tsn[i],"3")>1 || countCharacter(tsn[i],"6")>1 || countCharacter(tsn[i],"9")>1 ) {
			System.out.println(tsn[i]+" 짝짝");   
		   }
		   if(countCharacter(tsn[i],"3")==1 &&  countCharacter(tsn[i],"6")==1) {
			   System.out.println(tsn[i]+" 짝짝");
		   };
		   if(countCharacter(tsn[i],"3")==1 && countCharacter(tsn[i],"9")==1) {
			   System.out.println(tsn[i]+" 짝짝");
		   }
		   if(countCharacter(tsn[i],"6")==1 && countCharacter(tsn[i],"9")==1) {
			   System.out.println(tsn[i]+" 짝짝");
		   }
		}
	}
	
	
	//카운트세는 함수
	public static int countCharacter(String str1, String str2) {
		  String[] strArray;
		  strArray = str1.split("");		  
		  int num = 0;
		    for (int i = 0; i < strArray.length; i++) {
		        if(strArray[i].equals(str2)) {
		            num++;
		        }
		    }
		    return num;
	}
}
