package strings;

public class Kmp {

	public static void main(String[] args) {
		String txt = "AABAABBABAABABC";
		String pat = "AAB";
		checkPattern(txt, pat);
	}

	private static void checkPattern(String txt, String pat) {
		int lps[] = new int[pat.length()];
		computeLpsArray(pat, lps);
		int i = 0;
		int j = 0;
		int n = txt.length();
		int m = pat.length();
		while (i < n) {
			if (txt.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
			}
			if (j == m) {
				System.out.println("pattern matched:" + (i - j));
				j = lps[j - 1];
			} else if (i < n && pat.charAt(j) != txt.charAt(i)) {
				if (j != 0) {
					j = lps[j - 1];
				} else {
					i++;
				}
			}
		}
	}

	private static void computeLpsArray(String pat, int[] lps) {
		int n = pat.length();
		int i = 1;
		int len = 0;
		lps[0] = 0;
		while (i < n) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = len;
					i++;
				}
			}
		}
	}

}
