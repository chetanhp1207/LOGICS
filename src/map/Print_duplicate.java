package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Print_duplicate {
	public static void main(String[] args) {
		String s="methodoverriding";
		Map<Character, Integer> m=new LinkedHashMap<>();
		for(char x:s.toCharArray()) {
			m.put(x, m.getOrDefault(x, 0)+1);
		}
		for(Entry<Character, Integer> y: m.entrySet()) {
			if(y.getValue()>1)
			System.out.println(y.getKey());
		}
	}
}
