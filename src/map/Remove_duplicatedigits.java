package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Remove_duplicatedigits {
	public static void main(String[] args) {
		long n=1212363;
		Map<Integer, Integer> m=new LinkedHashMap<Integer, Integer>();
		while(n!=0) {
			int r=(int)n%10;
			m.put(r,1);
			n/=10;
		}
		for(Entry<Integer, Integer> y:m.entrySet()) {
			System.out.println(y.getKey());
		}
	}

}
