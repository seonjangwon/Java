package buffered_ex;

import java.io.*;

public class Ex01_BufferedWrite {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String var = "ㅅㅂ";
		bw.write(var); // 출력 안되는데?
		bw.newLine(); // 개행 즉 엔터역활?
		bw.write("i am writing"); // 개행과 함께 출력
		bw.flush(); // 남아있는데이터를 모두 출력
		bw.close();

	}

}
