package practice;

import java.io.*;

public class CountingRooms {
	static char[][] grid;
	static int[] rV = { -1, 0, 1, 0 };
	static int[] cV = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().trim().split(" ");
		int rows = Integer.parseInt(str[0]);
		int cols = Integer.parseInt(str[1]);
		grid = new char[rows][cols];
		for (int i = 0; i < rows; i++) {
			String rd = br.readLine().trim();
			for (int j = 0; j < cols; j++) {
				grid[i][j] = rd.charAt(j);
			}
		}
		System.out.println(findCC());
	}

	private static int findCC() {
		int counter = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '.') {
					counter++;
					dfs(i, j);
				}
			}
		}
		return counter;
	}

	private static boolean canMove(int r, int c) {
		if (r < grid.length && c < grid[0].length && r > -1 && c > -1
				&& grid[r][c] != '*' && grid[r][c] != '#') {
			return true;
		}
		return false;
	}

	private static void dfs(int rN, int cN) {
		grid[rN][cN] = '*';
		for (int i = 0; i < cV.length; i++) {
			if (canMove(rN + rV[i], cN + cV[i])) {
				dfs(rN + rV[i], cN + cV[i]);
			}
		}
	}
}
