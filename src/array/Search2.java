package array;

public class Search2 {
public static void main(String[] args) {
	int[] a= {23,12,2,6,99,11};
	int search=99;
	for(int i=0;i<a.length;i++) {
		if(a[i]==search) {
			System.out.println("the value found at"+i);
			return;
		}
	}
	System.out.println("value not found");
}
}
