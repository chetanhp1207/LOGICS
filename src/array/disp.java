package array;
import java.util.Scanner;
public class disp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter siz of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter values of index"+i);
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		sc.close();
		}

}


