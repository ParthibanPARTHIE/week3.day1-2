package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main (String [] args) {
		String text = "We learn java basics as part of java sessions in java wee1";
		String [] words = text.split("");
		Set<String> wordSet = new LinkedHashSet<String>();
		for (int i = 0 ; i<words.length; i++) {
			wordSet.add(words[i]);
		}
		System.out.println(wordSet);
		
	}

}
