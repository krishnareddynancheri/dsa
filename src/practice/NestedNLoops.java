package practice;

public class NestedNLoops {

	public static void main(String[] args) {
		printPossibilities(3);
	}

	private static void printPossibilities(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
	}

}
