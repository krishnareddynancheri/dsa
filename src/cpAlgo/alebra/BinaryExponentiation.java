package cpAlgo.alebra;


public class BinaryExponentiation {

	public static void main(String[] args) {
		System.out.println(binpow(3, 13));
//		System.out.println(binPowItr(3, 13));
	}

	static long binpow(long a, long b) {
		long res=1;
		while (b!=0) {
			if (b%2!=0) {
				res=res*a;
				b--;
			} else {
				a=a*a;
				b=b/2;
			}
		}
		return res;
	}
//
//	static long binPowItr(long a, long b) {
//		long res = 1;
//		while (b > 0) {
//			if ((b & 1) != 0)
//				res = res * a;
//			a = a * a;
//			b >>= 1;
//		}
//		return res;
//	}

}
