package ds.evolution;

import java.io.*;
import java.util.*;

public class Rangesum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		Map<Integer, Long> map=new HashMap<>();
		while (t-->0) {
			Integer.parseInt(br.readLine().trim());
			String[] arr=br.readLine().trim().split(" ");
			map.put(1, Long.parseLong(arr[0]));
			for (int i = 1; i < arr.length; i++) {
				map.put(i+1, Long.parseLong(arr[i])+map.get(i));
			}
			int q=Integer.parseInt(br.readLine().trim());
			while(q-->0) {
				String[] lrs=br.readLine().trim().split(" ");
				int lindex = Integer.parseInt(lrs[0]);
				int rindex = Integer.parseInt(lrs[1]);
				long sum=0;
				if (lindex==1) {
					sum=map.get(rindex);
				} else {
					sum=(map.get(rindex)-map.get(lindex))+(map.get(lindex)-map.get(lindex-1));
				}
				System.out.println(sum);
			}
		}
	}

}
