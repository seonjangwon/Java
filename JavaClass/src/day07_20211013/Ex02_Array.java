package day07_20211013;

public class Ex02_Array {

	public static void main(String[] args) {
		/*
		 * 배열 정수 타입의 number 배열 객체선언
		 */
		// 값도 없고 크기도 정해지지 않은 상태
		int[] num1;
//		System.out.println(num1[0]); // 값이 들어있지 않아서 사용 할 수 없다
		int num2[];
		int[] num3 = null;
		String[] strvars = null;

		// 배열 선언하면서 초깃값을 지정
		int[] num4 = { 1, 3, 33, 544 }; // 문자, 실수 불가능
		System.out.println(num4[1]);
		String[] strvar1 = { "가나", "다라", "ab", "cd" };// 정수, 실수 불가능
		System.out.println(strvar1[0]);

		// 배열에 저장된 값 출력하기 (인덱스 활용)
		System.out.println(num4[0]);
		System.out.println(num4[1]);
		System.out.println(num4[2]);
		System.out.println(num4[3]);
		System.out.println(num4);// 이건 깨지네
//		System.out.println(num4[4]); //오류다요!!!
		System.out.println(strvar1[0]);
		System.out.println(strvar1[1]);
		System.out.println(strvar1[2]);
		System.out.println(strvar1[3]);
		System.out.println(strvar1);// 이것도 깨지고

		// 배열 데이터 바꾸기
		// num4 2번 인데스에 99 저장
		System.out.println(num4[2]);
		num4[2] = 99;
		System.out.println(num4[2]);

		// 배열의 크기(몇 개의 데이터가 있는지) 확인
		System.out.println(num4.length);
		int num4Size = num4.length;
		System.out.println(num4Size);

		// 정수형
		// 이름 : num5
		// 크기 : 3
		// 인덱스 : 0~2
		int[] num5 = new int[3];// 기본값이 0으로 세팅이 되어 있다
		System.out.println(num5[0]);

		double[] num6 = new double[2];
		System.out.println(num6[0]);

		String[] strVar2 = new String[3];
		System.out.println(strVar2[0]); // null : 비어있다

		// 34, 555,7898, 1111이 들어잇는 정수형 배열 num을 선언하고
		// 이 배열에 들어잇는 값을 출력해보세요

		int[] arr = { 34, 555, 7897, 1111 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 총합과 평균을 계산
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println("총합 : " + result);
		System.out.println("평균 : " + (result / arr.length));

	}

}
