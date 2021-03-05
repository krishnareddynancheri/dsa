package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YoungPhysicist {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x=0,y=0,z=0;
		while (n-- > 0) {
			String[] arr = br.readLine().split(" ");
			x=x+Integer.parseInt(arr[0]);
			y=y+Integer.parseInt(arr[1]);
			z=z+Integer.parseInt(arr[2]);
		}
		System.out.println(x == 0 && y==0 && z==0 ? "YES" : "NO");
	}

}
