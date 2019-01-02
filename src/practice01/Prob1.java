package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );		
		System.out.println("수를 입력하세요");
		
		int num;
		
		num = scanner.nextInt();
		
		if((num % 3) == 0 && num >= 3) {
			System.out.println("3의배수입니다.");	
		}else {
			System.out.println("3의 배수가아닙니다.");
		}
		
		
		scanner.close();
	}
}
