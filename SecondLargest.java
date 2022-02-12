package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	public static void main(String[] args) {
		int data[] = {3,2,11,4,6,7};
		List<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<data.length;i++) {
			list.add(data[i]);
		}
		System.out.println("The input data is: "+list);
		Collections.sort(list);
		System.out.println("Ascending order: "+list);
		System.out.println("The second largest number is: "+list.get(1));

	}


}
