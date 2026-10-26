package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency_ofword {
	public static void main(String[] args) {
		String s="hi hello hi bye hi hello java";
		Map<String, Integer> m=new LinkedHashMap<>();
		for(String x:s.split(" ")) {
			m.put(x, m.getOrDefault(x, 0)+1);
		}
		for(Entry<String, Integer> y: m.entrySet()) {
			System.out.println(y.getKey()+" "+y.getValue());
		}
	}

}
