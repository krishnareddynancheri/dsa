package ds.numberTheory;

public class BinaryExponentiation {

	public static void main(String[] args) {
		System.out.println(printRes(2,13));
	}

	private static int printRes(int base, int pow) {
		int res=1;
		while (pow!=0) {
			if (pow%2==0) {
				base=base*base;
				pow=pow/2;
			} else {
				res=res*base;
				pow-=1;
			}
			System.out.println(pow);
		}
		return res;
	}

}
