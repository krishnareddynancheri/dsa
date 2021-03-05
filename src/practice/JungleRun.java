package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class JungleRun {
	static String[][] grid;
	static int[] rV = { -1, 0, 1, 0 };
	static int[] cV = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows, cols;
		rows = cols = Integer.parseInt(br.readLine().trim());
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			String[] rd = br.readLine().trim().split(" ");
			for (int j = 0; j < cols; j++) {
				grid[i][j] = rd[j];
			}
		}
		System.out.println(findSP());
	}

	private static int findSP() {
		Queue<String> q = new LinkedList<>();
		q.add("0,0");
		int[][] dist = new int[grid.length][grid.length];
		while (!q.isEmpty()) {
			String[] s = q.poll().trim().split("");
			int row = Integer.parseInt(s[0]);
			int col = Integer.parseInt(s[2]);
			grid[row][col] = "T";
			for (int i = 0; i < cV.length; i++) {
				if (canMove(row + rV[i], col + cV[i])) {
					dist[row + rV[i]][col + cV[i]] = dist[row][col] + 1;
					if (grid[row + rV[i]][col + cV[i]] == "E") {
						return dist[row + rV[i]][col + cV[i]];
					}
				}

			}
		}
		return 0;
	}

	private static boolean canMove(int r, int c) {
		return (r > -1 && c > -1 && r < grid.length && c < grid[0].length && grid[r][c] != "T") ? true : false;
	}

}
