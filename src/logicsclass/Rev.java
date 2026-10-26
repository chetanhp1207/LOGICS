package logicsclass;

public class Rev {
public static void main(String[] args) {
	String s="hi good morning";
	System.out.println("string after reverse:");
	Rev r=new Rev();
	r.rev(s);
}
void rev(String s) {
	String[] ch=s.split(" ");
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
		System.out.print(" ");
	}
}
}

