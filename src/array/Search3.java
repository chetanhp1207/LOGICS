package array;

public class Search3 {
//program to find first occurance of array
	public static void main(String[] args) {
		int a[]= {2,5,6,9,77,6,33};
		int n=6;
		int b=first(a,n);
		if(b>=0) {
			System.out.println("element found at index :"+b);
		}
		else
			System.out.println("element not found");
	}
	static int first(int[] a,int n) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				return i;
			}
		}
		return -1;
	}
}
