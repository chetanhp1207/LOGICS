package array_move;

import java.util.Arrays;

public class Zerolast {
public static void main(String[] args) {
	int[] a= {0,2,1,0,6,0,4,9};
	int temp[]=new int[a.length];
	int j=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0)
			temp[j++]=a[i];
	}
	System.out.println(Arrays.toString(temp));
}
}
