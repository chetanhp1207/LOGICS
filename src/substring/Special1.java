package substring;

public class Special1 {
public static void main(String[] args) {
	String s="$%^&&*(())_+-";
	if((s.replaceAll("[^0-9,a-z,A-Z]","")).length()==0)
		System.out.println("only special chars");
	else
		System.out.println("contains digits and letters");

}
}
