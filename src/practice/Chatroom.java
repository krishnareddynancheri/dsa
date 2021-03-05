package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chatroom {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String txt = br.readLine();
		String pat = "hello";
		int i = 0, j = 0;
		while (i < txt.length() && j < pat.length()) {
			if (txt.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
			} else {
				i++;
			}
		}
		System.out.println((j==pat.length())?"YES":"NO");
	}

}
