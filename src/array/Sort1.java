package array;

public class Sort1 {
public static void main(String[] args) {
	int a1[]= {9,4,5};
	int a2[]= {2,6,1};
	int a[]=new int[a1.length+a2.length];
	int k=0;
	for(int i=0;i<a1.length;i++) {
		a[k]=a1[i];
		k++;
	}
	for(int i=0;i<a2.length;i++) {
		a[k]=a2[i];
		k++;
	}
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			
		}
	}
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
}
}
