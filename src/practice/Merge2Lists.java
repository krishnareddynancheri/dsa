package practice;

import java.util.LinkedList;
import java.util.List;

public class Merge2Lists {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		l1.add(5);
		l1.add(10);
		l1.add(15);
		l2.add(2);
		l2.add(3);
		l2.add(20);
		
		List<Integer> mL=mergeLists(l1,l2);
		System.out.println(mL);
	}

	private static List<Integer> mergeLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		LinkedList<Integer> ml=new LinkedList<>();
		int l1idx=0;
		int l2idx=0;
		while (l1idx<l1.size() && l2idx<l2.size()) {
			if (l1.get(l1idx)<l2.get(l2idx)) {
				ml.add(l1.get(l1idx));
				l1idx++;
			}else {
				ml.add(l2.get(l2idx));
				l2idx++;
			}
		}
		while (l1idx<l1.size()) {
			ml.add(l1.get(l1idx++));
		}
		while (l2idx<l2.size()) {
			ml.add(l2.get(l2idx++));
		}
		return ml;
	}

}
