package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency_ofarray {
	public static void main(String[] args) {
		int a[]= {1,1,2,3,2,1,3,4,3,4,5};
		Map<Integer, Integer> m=new LinkedHashMap<>();
		for(int x:a) {
			m.put(x, m.getOrDefault(x, 0)+1);
		}
		for(Entry<Integer, Integer> y: m.entrySet()) {
			System.out.println(y.getKey()+" "+y.getValue());
		}
	}

}
