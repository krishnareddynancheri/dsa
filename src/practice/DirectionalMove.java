package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DirectionalMove {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			br.readLine();
			long angle = 0;
			StringBuffer str = new StringBuffer(br.readLine());
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '1') {
					angle += 90;
				} else {
					angle += 270;
				}
			}
			angle = angle % 360;
			switch ((int) angle) {
			case 90:
				System.out.println("N");
				break;
			case 180:
				System.out.println("W");
				break;
			case 270:
				System.out.println("S");
				break;
			case 0:
				System.out.println("E");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + angle);
			}
		}
	}

}
