package logicsclass;

import java.util.LinkedHashSet;
import java.util.Set;

public class union_of_arrays {
public static void main(String[] args) {
	int a[]= {1,2,3,4},b[]= {3,4,5,6};
	Set<Object> s=new LinkedHashSet<>();
	for(int x:a)
		s.add(x);
	for(int x:b)
		s.add(x);
	System.out.println(s);
}
}
