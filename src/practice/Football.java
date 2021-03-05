package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Football {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer str = new StringBuffer(br.readLine());
		if (str.toString().contains("0000000")||str.toString().contains("1111111")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
