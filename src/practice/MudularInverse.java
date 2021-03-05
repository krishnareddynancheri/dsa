package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
public class MudularInverse {
	static long x,y;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] abcm=br.readLine().split(" ");
        long a=Long.parseLong(abcm[0]);
        long b=Long.parseLong(abcm[1]);
        long c=Long.parseLong(abcm[2]);
        long m=Long.parseLong(abcm[3]);
        long ans1=modeExp(a,b,m);
        extendedEclidean(c,m);
        x=(x%m+m)%m;
        long ans2=x;
        System.out.println((ans1*ans2)%m);
	}
	private static void extendedEclidean(long c, long m) {
		if (m==0) {
			x=1;
			y=0;
		}else {
			extendedEclidean(m,c%m);
			long temp=x;
			x=y;
			y=temp-y*(c/m);
		}
	}

	private static long modeExp(long a, long b, long m) {
		long res=1;
		if (b==0) {
			return 1;
		}
		else {
			while (b!=0) {
				if (b%2!=0) {
					res=(res*a)%m;
				}
				a=(a*a)%m;
				b/=2;
			}
		}
		return res;
	}

}
