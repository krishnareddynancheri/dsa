package practice;

public class SquareBracketCount {

	static int[][] grid= {
			{1,1,1,1,1},
			{0,1,0,1,0},
			{0,1,1,1,0},
			{0,1,0,1,0},
			{1,1,1,1,1},
	};

	public static void main(String[] args) {
		int n = countSB();
		System.out.println(n);
	}
	private static int countSB() {
		int counter = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					counter += indCSB(i, j);
				}
			}
		}
		return counter;
	}
	private static int indCSB(int x, int y) {
		int cnt=0;
		if (	(y+1)<grid[0].length && grid[x][y] == 1 && grid[x][1+y] == 1) {
			int lM=findMax(x+1,y+1);
			for (int i = lM; i > x; i--) {
				if (
						(i-1)>0 && (y+1)<grid[0].length &&
						grid[i-1][1+y] == 1 && 
						grid[i][1+y] == 1 && 
						grid[i][y] == 1 && x+2<=i
						) {
					cnt++;
				}
			}
		}
		if (	(y-1)>0 && grid[x][y] == 1 && grid[x][y-1] == 1) {
			int lM=findMax(x+1,y-1);
			for (int i = lM; i > x; i--) {
				if (
						(i-1)>0 && (y-1)>0 &&
						grid[i-1][y-1] == 1 && 
						grid[i][y-1] == 1 && 
						grid[i][y] == 1 && x+2<=i
						) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	private static int findMax(int x, int y) {
		while (x<grid.length && y<grid[0].length && grid[x][y]==1) {
			x++;
		}
		return x-1;
	}
}