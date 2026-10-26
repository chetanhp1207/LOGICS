package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Print_uniquedigits {
	public static void main(String[] args) {
		long n=121236543;
		Map<Integer, Integer> m=new LinkedHashMap<Integer, Integer>();
		while(n!=0) {
			int r=(int)n%10;
			m.put(r, m.getOrDefault(r, 0)+1);
			n/=10;
		}
		for(Entry<Integer, Integer> y:m.entrySet()) {
			if(y.getValue()==1)
			System.out.println(y.getKey());
		}
	}

}
