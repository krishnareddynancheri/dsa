package numberTheory;

public class ModularMultiplicativeInverse {
	static int x, y, gcd;
	public static void main(String[] args) {
		int A=5;
		int B=11;
		extendedEclidean(A,B);
		System.out.println((x%B+B)%B);
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
