package buffered_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex05_zzzz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num1 = 0, num2 = 0, i = 0;
		boolean run = true;
		num1 = Integer.parseInt(br.readLine());// 받은 숫자
		num2 = num1;
		while (run) {
			num1 = (((num1 % 10) * 10) + (((num1 / 10) + (num1 % 10)) % 10));
			i++;
			if (num1 == num2)
				run = false;
		}
		bw.write(String.valueOf(i));
		bw.flush();

		bw.close();
		br.close();
	}

}
