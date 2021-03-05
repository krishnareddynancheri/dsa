package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PerSum {

	static double[] bArr;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while (t-->0) {
			int counter=0;
			String[] nk=br.readLine().split(" ");
			int n=Integer.parseInt(nk[0]);
			int k=Integer.parseInt(nk[1]);
			bArr=new double[n];
			String[] nArr=br.readLine().split(" ");
			for (int i = 0; i < nArr.length; i++) {
				bArr[i]=Math.pow(k, Integer.parseInt(nArr[i]));
			}
			for (int i = 0; i < bArr.length; i++) {
				double sum=bArr[i];
				for (int j = i+1; j < bArr.length; j++) {
					sum+=bArr[j];
					if ((sum)==(bArr[i]*bArr[j])) {
						counter++;
					}
				}
			}
			System.out.println(counter);
		}
	}

}
//1
//5 2
//0 1 1 2 3

//1
//5 2
//0 1 1 1 0