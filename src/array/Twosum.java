package array;

public class Twosum {
public static void main(String[] args) {
	int[] a= {2,5,7,9,3,8,1,6,4};
	int target=10;
	for (int i = 0; i < a.length-1; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]+a[j]==target) {
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}
}
}
