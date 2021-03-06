package day05_20211008;

import java.io.*;

public class Ex05_WhileEx {

	public static void main(String[] args) throws IOException {
		/*
		 * 주사위(1~6)가 있을 때 주사위를 계속 던져서 6이 나오면 종료가 되는 프로그램을 while로 작성해보시오
		 */

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = 0, i = 0;
		boolean run = true;
		
		bw.write("횟수 : "+String.valueOf(i)+"\n");
		while (run) {
			num = (int) ((Math.random() * 6) + 1);
			i++;
			bw.write("횟수 : "+String.valueOf(i)+"\n");
			if (num == 6) {
				bw.write("주사위 : " + String.valueOf(num) + " 횟수 : " + String.valueOf(i)+"에 종료합니다.\n");
				run = false;
			}
		}
		bw.flush();

		bw.close();

	}

}
