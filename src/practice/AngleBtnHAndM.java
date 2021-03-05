package practice;

public class AngleBtnHAndM {

	public static void main(String[] args) {
		int hours=12;
		int minutes=0;
		double res=Math.abs(((60*hours)-(11*minutes))/2);
		res=res%360;
		if (res>180) {
			res=360-res;
		}
		System.out.println(res);
	}

}
