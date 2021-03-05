package practice;
import java.io.*;


public class OddDivisor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while (t-->0) {
			long n=Long.parseLong(br.readLine().trim());
			System.out.println(((n&(n-1))==0)?"No":"Yes");
		}
	}

}
