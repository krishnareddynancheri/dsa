package numberTheory;

public class BinaryExponentiation {

	public static void main(String[] args) {
		System.out.println(printRes(2,10));
	}

	private static int printRes(int base, int pow) {
		int res=1;
		while (pow!=0) {
			if (pow%2==1) {
				res=res*base;
			}
			base=base*base;
			pow/=2;
		}
		return res;
	}

}
