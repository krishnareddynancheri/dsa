package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HQ9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String program=br.readLine();
		if (program.contains("H")||program.contains("Q")||program.contains("9")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
