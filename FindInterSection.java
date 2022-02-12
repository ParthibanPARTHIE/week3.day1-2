package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindInterSection {
	public static void main (String[] args) {
		int Array1[] = { 3, 2, 11, 4, 6, 7 };
		int Array2[] = { 1, 2, 8, 4, 9, 7 };
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.print("List1: ");
		for (int i = 0; i < Array1.length; i++) {
			list1.add(Array1[i]);
			System.out.print(list1.get(i) + " ");
		}
		System.out.print("List2: ");
		for (int i = 0; i < Array2.length; i++) {
			list2.add(Array2[i]);
			System.out.print(list2.get(i) + " ");
		}
		System.out.println("");
		System.out.print("The intersection values are : ");
		for (int j = 0; j < list2.size(); j++) {
			if (list1.contains(list2.get(j))) {
				System.out.print(list2.get(j)+"  ");

			}
		}
	}
		

}
