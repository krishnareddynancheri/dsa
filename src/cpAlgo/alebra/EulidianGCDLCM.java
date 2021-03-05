package cpAlgo.alebra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EulidianGCDLCM {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while (t-->0) {
			String[] ab=br.readLine().trim().split(" ");
			long a=Long.parseLong(ab[0]);
			long b=Long.parseLong(ab[1]);
			long gcdN=gcd(a,b);
			long lcmN=lcm(a,b,gcdN);
			System.out.println(gcdN+" "+lcmN);
		}
	}

	private static long lcm(long a, long b, long gcdN) {
		return a/gcdN*b;
	}

	private static long gcd(long a, long b) {
		if (b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

}
