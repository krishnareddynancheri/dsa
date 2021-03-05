package numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SieveTheorem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int range = 90000001;
		List<Integer> list=new ArrayList<>();
		boolean[] arr = new boolean[range + 1];
		arr[0] = arr[1] = true;
		for (int i = 2; i * i < range; i++) {
			for (int j = i*i; j <= range; j+=i) {
				arr[j] = true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i])
				list.add(i);
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while (t-->0) {
			int k=Integer.parseInt(br.readLine().trim());
			System.out.println(list.get(k-1));
		}
	}

}
