package logicsclass;

import java.util.ArrayList;
import java.util.List;

public class Missing_elements_2 {
public static void main(String[] args) {
	int a[]= {15,6,10,1,13,2};
	int min=a[0],max=a[0];
	List<Integer> l1=new ArrayList<>();
	for(int x:a) {
		if(x<min)
			min=x;
		if(x>max)
			max=x;
		l1.add(x);
	}
	for(int i=min;i<=max;i++) {
		if(!l1.contains(i))
			System.out.println(i+" ");
	}
}
}
