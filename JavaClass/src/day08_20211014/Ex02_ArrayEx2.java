package day08_20211014;

import java.util.Scanner;

public class Ex02_ArrayEx2 {

	public static void main(String[] args) {
		// 1. 학생수 2. 점수입력 3. 점수리스트 4.분석 5.종료
		// while + 스위치 케이스 + for + 배열 + 최댓값 + 내림차순
		Scanner scan = new Scanner(System.in);

		int num1 = 0; // 번호를 받을거야
		int student = 0; // 학생수를 받을거야
		int score = 0; // 점수를 받을거야
		int[] list = null; // 학생 리스트용인데 크기는 학생수를 받은다음 할거야
		int max = 0; // 최고점수용이야
		double sum = 0; // 합계용이야
		int temp = 0; // swap용 내림차순정리용이야
		boolean run = true; // while 용

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");
			num1 = scan.nextInt();
			
			if(num1==1) { // 학생수
				System.out.print("학생수 > ");
				student = scan.nextInt();
				list = new int[student]; // 배열 크기를 학생수만큼 만들어줘
			} else if(num1==2) {// 점수입력 (for+배열)
				for (int i = 0; i < student; i++) {
					System.out.print((i+1) + "번 학생 점수입력 > ");
					score = scan.nextInt();
					list[i] = score;
				}
			} else if (num1==3) { // 점수 리스트 (for)
				for (int i = 1; i <= student; i++) {
					System.out.println(i + "번 학생 점수 : " + list[(i - 1)]);
				}
			} else if (num1==4) { // 분석
				for (int i = 0; i < list.length; i++) {// 최고점수
					if (list[i] > max) {
						max = list[i];
					}
				}
				for (int i = 0; i < student; i++) {// 평균용
					sum += list[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균 : " + (sum / (double)student));
				for (int i = 0; i < list.length; i++) {// 내림차순 정리
					for (int j = i + 1; j < list.length; j++) {
						if (list[i] < list[j]) {
							temp = list[i];
							list[i] = list[j];
							list[j] = temp;
						}
					}
				}
				for (int i = 0; i < list.length; i++) {
					System.out.println((i + 1) + "등 점수 : " + list[i]);
				}

			} else if (num1==5) { // 종료
				System.out.println("종료합니다.");
				run = false;
			}

			

		}

	}

}
