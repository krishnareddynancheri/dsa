package numberTheory;

public class ExtendedEclidean {
	static int x, y, gcd;

	public static void main(String[] args) {
		extendedEclidean(4,5);
		System.out.println("gcd:" + gcd);
		System.out.println("x:" + x + " y:" + y);
	}

	private static void extendedEclidean(int a, int b) {
		if (b == 0) {
			gcd = a;
			x = 1;
			y = 0;
		} else {
			extendedEclidean(b, a % b);
			int temp = x;
			x = y;
			y = temp - y * (a / b);
		}
	}

}
