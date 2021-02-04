package hackerEarth;

import java.util.*;

class Test {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int m = s.nextInt();

		int i, a, b, x, j;

		int arr[][] = new int[n][n];

		ArrayList<Integer> edges1 = new ArrayList<>();

		ArrayList<Integer> edges2 = new ArrayList<>();

		for (i = 0; i < m; i++) {

			a = s.nextInt();

			b = s.nextInt();

			edges1.add(a - 1);

			edges2.add(b - 1);

			arr[a - 1][b - 1] = 1;

			arr[b - 1][a - 1] = 1;

		}

		int q = s.nextInt();

		int main = getComponents(arr, n);

		for (int z = 0; z < q; z++) {

			x = s.nextInt();

			x--;

			int arr2[][] = new int[n - 1][n - 1];

			int delEdges = 0;

			for (i = 0; i < m; i++) {

				a = edges1.get(i);

				b = edges2.get(i);

				if (x != a && x != b) {

					if (a > x) // row shift

						a--;

					if (b > x) // col shift

						b--;

					arr2[a][b] = 1;

					arr2[b][a] = 1;

				}

				else {

					delEdges++;

				}

			}

			int ne = getComponents(arr2, n - 1);

			if (ne > main) {

				System.out.println("Satisfied " + delEdges);

			}

			else

				System.out.println("Not Satisfied");

		}

	}

	public static int getComponents(int[][] arr, int n) {

		ArrayList<Integer> visited = new ArrayList<>();

		ArrayList<Integer> q = new ArrayList<>();

		int cur = 0;

		int comps = 0;

		while (visited.size() != n && cur < n) { // BFS loop for each component

			if (!visited.contains(cur)) {

				q.add(cur);

				comps++;

			}

			while (q.size() > 0) {

				int x = q.get(0);

				visited.add(x);

				for (int j = 0; j < n; j++) {

					if (arr[x][j] == 1 && !visited.contains(j) && !q.contains(j)) {

						q.add(j);

					}

				}

				q.remove(0);

			}

			cur++;

		}

		return comps;

	}

}
