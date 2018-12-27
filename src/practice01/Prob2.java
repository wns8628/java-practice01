package practice01;

public class Prob2 {
	public static void main(String[] args) {

//		int a = 1;
//		int j = 10;
//		while(j<=18) {
//		 for(int i=a; i<=j; i++) {	
//		  System.out.print(i+" ");
//		 }
//		 System.out.println(""); //줄바꿈
//		 a++;
//		 j++;
//		}
		
		//for문
		int a=1;
		for(int j=10; j<=18; j++) {
			for(int i = a; i<=j; i++) {
				System.out.print(i+" ");
			}
			a++;
			System.out.println("");
		}
	
	}
}

