package day09_20211015;

public class Student {
	// 필드
	String name; // 이름
	String num; // 학번
	String var; // 학과
	int age; // 나이
	Student(){
		
	}
	
	Student(String name, String num, String var, int age){
		this.name = name;
		this.num = num;
		this.var = var;		
		this.age = age;
	}
	Student(String name, String num){
		this.name = name;
		this.num = num;
	}
	Student(String num, String var, int age){
		this.num = num;
		this.var = var;		
		this.age = age;
	}
	
	
	
	
	
}
