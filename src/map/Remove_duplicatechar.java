package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Remove_duplicatechar {
	public static void main(String[] args) {
		String s="aabbceeedd";
		Map<Character, Integer> m=new LinkedHashMap<>();
		for(char x:s.toCharArray()) {
			m.put(x, 1);
		}
		for(Entry<Character, Integer> y: m.entrySet()) {
			
			System.out.println(y.getKey()+" "+y.getValue());
		}
	}
}
