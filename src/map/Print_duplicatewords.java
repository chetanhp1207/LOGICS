package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Print_duplicatewords {
	public static void main(String[] args) {
		String s="hi hello hi bye hi hello java";
		Map<String, Integer> m=new LinkedHashMap<>();
		for(String x:s.split(" ")) {
			m.put(x, m.getOrDefault(x, 0)+1);
		}
		for(Entry<String, Integer> y: m.entrySet()) {
			if(y.getValue()>1)
			System.out.println(y.getKey());
		}
	}

}
