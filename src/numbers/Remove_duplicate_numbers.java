package numbers;

import java.util.LinkedHashSet;


public class Remove_duplicate_numbers {
public static void main(String[] args) {
	int a[]= {1,3,4,5,6,2,2,1,3,6,5,4,4,3,2};
	LinkedHashSet<Object> s1=new LinkedHashSet<>();
	for(int x:a) {
		s1.add(x);
	}
	System.out.println(s1);
	
}
}
