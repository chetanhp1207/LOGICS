package logicsclass;

public class Next_prime {
    public static void main(String[] args) {
        int n = 7;
        
        for (int i = n + 1; i <= 2 * n; i++) {
            boolean flag = true; 
            
            if (i <= 1) {
                flag = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            
            if (flag) {
                System.out.println(i); 
                break;
            }
        }
    }
}
