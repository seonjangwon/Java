package day09_20211015;

public class PeopleMain {

	public static void main(String[] args) {
		// 기본생성자를 활용한 people 클래스 객체 선언
		People p1 = new People();
		// People 클래스 타입의 변수 p1
		
		// 필드 활용
		// p1 객체의 name 필드에 이름1 이라는 데이터 저장
		System.out.println(p1.name);
		p1.name = "이름1";
		System.out.println(p1.name);
		
		People p2 = new People();
		p2.name= "이름2";
		System.out.println(p1.name);
		System.out.println(p2.name);
		p1.age = 10;
		p1.nation = "대한민국";
		
		System.out.println(p2.age);
		
		System.out.println(p1.nation);
		System.out.println(p2.nation);
		
		// 매개변수가 있는 생성자를 활용한 객체생성
		// 매개값으로 필드값을 지정
		People p3 = new People("이름3", 11, "스위스");
		System.out.println(p3.age);
		// 변경가능
		p3.age = 13;
		System.out.println(p3.age);
		
		
		
		
	}

}
