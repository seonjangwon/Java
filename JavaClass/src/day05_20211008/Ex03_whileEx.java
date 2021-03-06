package day05_20211008;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex03_whileEx {

	public static void main(String[] args) throws IOException {
		/*
		 * while문을 이용해 1부터 10까지 합계 출력
		 * 
		 */

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = 1, result = 0;

		while (num <= 10) {
			if (num <= 9) {
				bw.write(String.valueOf(num) + "+");
				result += num;
				num++;
			} else {
				result +=num;
				bw.write(String.valueOf(num) + "=" + result+"\n");
				num++;
			}
		}
		bw.flush();

		bw.close();

	}

}
