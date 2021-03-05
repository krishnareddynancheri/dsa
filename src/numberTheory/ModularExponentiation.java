package numberTheory;

public class ModularExponentiation {

	public static void main(String[] args) {
//		double a=Math.pow(10, 18);
//		double b=Math.pow(10, 18);
//		double c=Math.pow(10, 9)+7;
//		double res=(a%c*b%c)%c;
		int a=12,b=15,c=4;
		int res=(a-b+c)%c;
		System.out.println(res);
	}

}
