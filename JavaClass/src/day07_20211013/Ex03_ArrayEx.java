package day07_20211013;

import java.util.Scanner;

public class Ex03_ArrayEx {

	public static void main(String[] args) {
		/*
		 * 크기가 3인 정수형 배열을 선언하고 스캐너를 이용해 배열에 데이터를 저장하고 저장된 값의 총합, 평균을 계산하시오
		 */
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[3];// 배열
		int num = 0;// 입력
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번 정수 입력 : ");
			num = scan.nextInt();
			arr[i] = num;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (sum / arr.length));

	}

}
