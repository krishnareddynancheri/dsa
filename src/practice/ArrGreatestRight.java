package practice;

public class ArrGreatestRight {

	public static void main(String[] args) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int max = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = max;
			if (temp > max) {
				max = temp;
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
