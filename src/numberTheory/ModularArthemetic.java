package numberTheory;

public class ModularArthemetic {

	public static void main(String[] args) {
		long ap=(long)Math.pow(10, 18);
		long bp=(long)Math.pow(10, 18);
		long c=(long)Math.pow(10, 9)+7;
		long result=((ap%c)*(bp%c))%c;
		System.out.println(result);
	}

}
