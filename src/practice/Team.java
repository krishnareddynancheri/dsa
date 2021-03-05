package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Team {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while (t-->0) {
			String[] nk=br.readLine().split(" ");
			int k=Integer.parseInt(nk[1]);
			String[] arr=br.readLine().split(" ");
			int[] arr1=new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr1[i]=Integer.parseInt(arr[i]);
			}
			Arrays.sort(arr1);
			int left=0,right=arr1.length-1;
			int teams=countTeams(arr1,left,right,k,0);
			System.out.println(teams);
		}
	}

	private static int countTeams(int[] arr, int left, int right,int k,int counter) {
		if (right<left) {
			return counter;
		}
		if (arr[right]>=k) {
			return countTeams(arr,left,right-1,k,counter+1);
		}else if(arr[left]+arr[right]>=k && left!=right) {
			return countTeams(arr,left+1,right-1,k,counter+1);
		}else{
			return countTeams(arr,left+1,right,k,counter);
		}
	}

}
