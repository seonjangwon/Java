package day09_20211015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex00_BJA4344 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 4344번
		// 테스트 숫자를 받고
		// 첫자리는 인원수
		// 나머지는 점수
		// 점수를 평균내고
		// 평균보다 높은 사람 / 전체인원
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = 0; // 이건 테스트 숫자
		String var = ""; // 두번째 줄부터 받는 변수
		int people = 0; // 인원수
		int score = 0 ; // 점수
		int[] scorearr = null;
		int sum = 0; // 평균용 합계
		int win = 0; // 평균보다 높은
		
		test = br.read();
		
		for (int i=0;i<test;i++) {
			var = br.readLine();
			StringTokenizer st = new StringTokenizer(var);
			people = Integer.parseInt(st.nextToken());
			scorearr = new int[people]; // 점수 담을 배열 까지 만듬. 배열에 점수 입력부터하자
			for(int j=0; j<people;j++) {
				
			}
		}
		

	}

}
