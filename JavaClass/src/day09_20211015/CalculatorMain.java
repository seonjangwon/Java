package day09_20211015;

public class CalculatorMain {

	public static void main(String[] args) {
		// 덧셈
		int num1 = 10;
		int num2 = 20;
		int sum = 0 ;
		
		sum = num1+num2;
		System.out.println(sum);
		
		// 덧셈을 수행하기 위한 메서드만 호출하는 코드
		Calculator cal1 = new Calculator();
		// add1 메서드 호출
		cal1.add1();
		// 리턴데이터를 변수에 저장하기
		int result = 0;
		result = cal1.add1();
		System.out.println(result);
		// 리턴 데이터를 바로 호출하기
		System.out.println(cal1.add1());
		
		
		System.out.println(cal1.add2(20,30));// 오 되네 ㅎ
		
		result = cal1.add3(2, 3);
		System.out.println(result);
		
		// 리턴이 없는 메서드 호출
		cal1.add4();
		
//		result = cal1.add4();  // 줄게 없으니 오류가 나온다
//		System.out.println(cal1.add4()); // 이것도 안된다
		
		//add5 호출
		cal1.add5(3, 4);
		
		

	}

}
