package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		
		while(true) {
		Scanner scanner = new Scanner( System.in );
		
		int odd_num  =0; //홀수
		int even_num =0; //짝수
		int scan_num =0; //받은값

		System.out.print("숫자입력하세요 : ");
		scan_num = scanner.nextInt();
		
		for(int i=1; i<= scan_num; i++) {
			
			if(i % 2 == 0) { //짝수면	
				even_num += i;
			}else {
				odd_num += i;
			}
			
		}
		
		if(scan_num % 2 ==1 ) {
			System.out.print("결과 값 : ");
			System.out.println(odd_num);			
		}else {
			System.out.print("결과 값 : ");
			System.out.println(even_num);		
		}
		
	  }
	}
}
