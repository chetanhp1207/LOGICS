package logicsclass;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicates_array {
public static void main(String[] args) {
	int a[]= {1,2,1,3,4,2,1,5,3,3};
	Set<Integer> s=new LinkedHashSet<>();
	for (int x : a) {
		s.add(x);
	}
	for (int x : s) {
		System.out.println(x);
	}
	
}
}
