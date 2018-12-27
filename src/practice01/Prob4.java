package practice01;
import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		String message;
		String[] strArray;
		
        System.out.print("문자열을 입력하세요: ");
        message = scanner.nextLine();
        strArray = message.split("");

  
        
        for(int i =0; i< strArray.length; i++) {
	        for(int j = 0; j<=i; j++) {
	        	    System.out.print(strArray[j]);        			
	        }
	        System.out.println("");
        }
	}
}
