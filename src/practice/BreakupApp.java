package practice;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BreakupApp {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		while (n-- > 0) {
			String[] str = br.readLine().split(" ");
			for (int i = 0; i < str.length; i++) {
				try {
					int k = Integer.parseInt(str[i]);
					if (map.containsKey(k)) {
						if (str[0].equals("G:")) {
							map.put(k, map.get(k) + 2);
						} else {
							map.put(k, map.get(k) + 1);
						}
					} else {
						if (str[0].equals("G:")) {
							map.put(k, 2);
						} else {
							map.put(k, 1);
						}
					}
				} catch (Exception e) {

				}
			}
		}
		int max=0;
		int date=0;
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()>=max) {
				if (entry.getValue()==max) {
					date=-1;
					break;
				}
				max=entry.getValue();
				date=entry.getKey();
			}
		}
		System.out.println(map);
		if (date==19 || date==20) {
			System.out.println("Date");
		}else {
			System.out.println("No Date");
		}
	}

}
