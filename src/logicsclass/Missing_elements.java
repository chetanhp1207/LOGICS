package logicsclass;

import java.util.ArrayList;
import java.util.List;

public class Missing_elements {
public static  void main(String[] args) {
	int a[]= {2,4,6,10,13};
	List<Object> l1=new ArrayList<>();
	for(int x:a)
		l1.add(x);
	for(int i=a[0];i<a[a.length-1];i++) {
		if(!l1.contains(i))
			System.out.print(i+" ");
	}
}
}
