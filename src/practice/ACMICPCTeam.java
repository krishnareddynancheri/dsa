package practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ACMICPCTeam {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] nm=br.readLine().trim().split(" ");
		int n=Integer.parseInt(nm[0]);
		int m=Integer.parseInt(nm[1]);
		String[] arr=new String[n];
		for (int i = 0; i < n; i++) {
			arr[i]=br.readLine().trim();
		}
		checkMaxT(arr);
	}

	private static void checkMaxT(String[] arr) {
		int known=0;
		int teams=0;
		for (int i = 0; i < arr.length; i++) {
			int cnt=0;
			for (int j = i+1; j < arr.length; j++) {
				char a;
				cnt=0;
				for (int k = 0; k < arr[0].length(); k++) {
					a=(char) (arr[i].charAt(k)|arr[j].charAt(k));
					if (a=='1') {
						cnt++;
					}
				}
				if (cnt==known) {
					teams+=1;
				}else if (cnt>known) {
					known=cnt;
					teams=1;
				}
			}
		}
		System.out.println(known);
		System.out.println(teams);
	}

}
