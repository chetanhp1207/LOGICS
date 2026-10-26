package array;

public class Search5 {
	//program to find all occurance of array
		public static void main(String[] args) {
			int a[]= {2,5,6,9,77,6,33};
			int n=6;
			all(a,n);
			
		}
		static void all(int[] a,int n) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==n) {
					System.out.println("element found at index: "+i);
				}
			}
		}
	}


