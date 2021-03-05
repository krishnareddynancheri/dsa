package practice;



public class MagicSquare {
	static int arr[][][] = {
		    {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
		    {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
		    {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
		    {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
		    {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}, 
		    {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, 
		    {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
		    {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},  
		};
	public static void main(String[] args) {
		int[][] s= {{9,3,3},{3,3,2},{1,8,1}};
		int min=Integer.MAX_VALUE;
		for (int k = 0; k < arr.length; k++) {
			int[][] l=arr[k];
			int cnt=0;
			for (int i = 0; i < l.length; i++) {
				for (int j = 0; j < l.length; j++) {
					cnt+=Math.abs(l[i][j]-s[i][j]);
				}
			}
			min=Math.min(cnt, min);
		
		}
		System.out.println(min);
	}

}
