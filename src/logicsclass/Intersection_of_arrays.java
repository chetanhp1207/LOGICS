package logicsclass;

import java.util.LinkedHashSet;
import java.util.Set;

public class Intersection_of_arrays {
public static void main(String[] args) {
	int a[]= {1,2,3,4},b[]= {3,4,5,6};
	Set<Object> s1=new LinkedHashSet<>();
	for(int x:a)
		s1.add(x);
	Set<Object> s2=new LinkedHashSet<>();
	for(int y:b) {
		if(!s1.contains(y))
			s2.add(y);
	}
	System.out.println(s2);
}
}
