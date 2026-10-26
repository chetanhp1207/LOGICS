package numbers;

public class Fib {
public static void main(String[] args) {
	int f1=0,f2=1,f3=0;
	System.out.println(f1);
	System.out.println(f2);
	/*for(int i=2;i<10;i++) {
		int f3=f1+f2;
		System.out.println(f3);
		f1=f2;
		f2=f3;
	}*/
	while(f3<100) {
		 f3=f1+f2;
		 System.out.println(f2);
			f1=f2;
			f2=f3;
			
	}
}
}
