package numbers;

import java.util.LinkedHashSet;

public class Remove_duplicate_digits {
public static void main(String[] args) {
	long n=1232132454;
	LinkedHashSet<Integer> s1=new LinkedHashSet<>();
	while(n!=0){
		Integer rem=(int) (n%10);
		s1.add(rem);
		n/=10;
		
	}
	System.out.println(s1);
}
}
