package day07_20211013;

import java.util.Scanner;

public class Ex07_ArrayCoin {

	public static void main(String[] args) {
		/*
		 * 거스름 돈 계산하기
		 */
		Scanner scan = new Scanner(System.in);

		int[] coin = { 500, 100, 50, 10 };
		int num1 = 0; // 거스름 돈
		int num2 = 0; // 동전 숫자

		System.out.print("거스름 돈 : ");
		num1 = scan.nextInt();

		for (int i = 0; i < coin.length; i++) {
			if (num1 >= coin[i]) { // if를 쓰면 필요 없는 동전은 안나옴
				num2 = num1 / coin[i]; // 필요 동전  숫자
				num1 -= (num2*coin[i]); // 거스름돈에서 잔돈(동전 x 숫자)을 빼자
				System.out.println(coin[i]+"원 "+num2+"개");
				System.out.println(num1+"원 남음");
			}
		}
		
//		for (int i = 0; i < coin.length; i++) {
//			num2 = num1 / coin[i];
//			System.out.println(coin[i] + "원 " + num2 + "개");
//			num1 = num1 % coin[i];
//			num1%=num2;
//		}

		scan.close();
	}

}
