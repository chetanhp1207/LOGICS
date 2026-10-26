package logicsclass;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_words {
	public static void main(String[] args) {
		String s="hi hello bye hi bye hello hi bye";
		String[] ch=s.split(" ");
		Set<String> s1=new LinkedHashSet<>();
		for(String x:ch) {
			s1.add(x);
		}
		System.out.println(s1);
	}
}
