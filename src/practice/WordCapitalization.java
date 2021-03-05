package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCapitalization {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer str = new StringBuffer(br.readLine());
		str.replace(0, 1, str.substring(0, 1).toUpperCase());
		System.out.println(str.toString());
	}

}
