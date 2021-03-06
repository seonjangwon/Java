package day10_20211018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Ex00_BJA4344 {

	public static void main(String[] args) throws IOException {
		// 백준알고리즘 4344번
		// 학원에 풀던거 있는데 다시해야해
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat form = new DecimalFormat("#.###");
		int test = 0; // 테스트 숫자를 받을거얌
		String test2 = ""; // 2번 줄
		int student = 0; // 학생 숫자
		int sorce = 0; // 점수
		int student2 = 0;// 평균을 넘는 애들 숫자
		int sum = 0; // 평균용
		double average = 0.000;

		int[] list = null;// 학생들 점수 넣을 배열 크기는 학생숫자를 받아서 입력

		test = Integer.parseInt(br.readLine());

		for (int i = 0; i < test; i++) {// 2줄부터 나눠야하니
			test2 = br.readLine();
			student2 = 0;
			sum=0;
			StringTokenizer st = new StringTokenizer(test2);
			student = Integer.parseInt(st.nextToken()); // 처음 숫자는 학생수
//			System.out.println("학생"+student);
			list = new int[student]; // 학생수만큼 배열 크기 지정
			for (int j = 0; j < student; j++) {// 학생 점수 입력
				sorce = Integer.parseInt(st.nextToken());
				list[j] = sorce;
//				System.out.println("리스트" + list[j]);
			}
			for (int s = 0; s < student; s++) {// 평균을 구하자?
				sum += list[s];
			}
//			System.out.println("합"+sum);
			average = sum / student; // 평균
//			System.out.println("평"+average);
			for (int j = 0; j < student; j++) {// 평균보다 높은애들 구하기
				if (average < list[j]) {
					student2++;
				}
//				System.out.println("2 "+student2);
			}
//			bw.write(form.format(((double) student2 / student * 100)) + "%"+"\n");
			System.out.printf("%.3f%%\n",((double) student2 / student * 100));
			
		}
//		bw.flush();
//		bw.close();
		br.close();
	}

}
