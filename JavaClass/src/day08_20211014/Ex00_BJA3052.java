package day08_20211014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex00_BJA3052 {

	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 3052
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = 0;// 숫자를 받을거야
		int count = 0; // 숫자를 셀거야
		int result = 0;
		int[] arr = new int[10]; // 숫자를 넣을거야

		for (int i = 0; i < arr.length; i++) {
			num1 = Integer.parseInt(br.readLine());
			arr[i] = (num1 % 42);
//			System.out.println("배열 1 : "+arr[i]);
		} // 배열 완성!
		for (int i = 0; i < 10; i++) {// 비교를 해야겠지
			count = 0;
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				result++;
			}
		}
		System.out.println(result);

	}

}
