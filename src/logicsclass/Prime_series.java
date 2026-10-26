package logicsclass;

public class Prime_series {
	    public static void main(String[] args) {
	        int start=1,range=25;
	        
	        for (int i = start; i <= range; i++) {
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
	            }
	        }
	    }
	}


