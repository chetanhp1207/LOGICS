package logicsclass;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_char {
public static void main(String[] args) {
	String s="ababbccaddbd";
	char[] ch=s.toCharArray();
	Set<Character> s1=new LinkedHashSet<>();
	for(char x:ch) {
		s1.add(x);
	}
	System.out.println(s1);
}
}
