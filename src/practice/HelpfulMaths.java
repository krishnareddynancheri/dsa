package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HelpfulMaths {

	public static void main(String[] args) throws IOException {
		Map<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("");
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		StringBuffer res = new StringBuffer();
		int s1 = map.containsKey("1") ? map.get("1") : 0;
		int s2 = map.containsKey("2") ? map.get("2") : 0;
		int s3 = map.containsKey("3") ? map.get("3") : 0;
		while (s1-- > 0) {
			res.append("1+");
		}
		while (s2-- > 0) {
			res.append("2+");
		}
		while (s3-- > 0) {
			res.append("3+");
		}
		String result = res.toString();
		System.out.println(result.substring(0, result.length() - 1));
	}

}
