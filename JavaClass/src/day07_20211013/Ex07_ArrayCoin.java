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
		int num2 = 0; // 남은돈
		
		System.out.print("거스름 돈 : ");
		num1 = scan.nextInt();

		for (int i = 0; i < coin.length; i++) {
			if (num1 >= coin[i]) {
				num2 = num1 / coin[i];
				num1 -= (num2*coin[i]);
				System.out.println(coin[i]+"원 "+num2+"개");
				System.out.println(num1+"원 남음");
			}
			scan.close();
		}
		

	}

}