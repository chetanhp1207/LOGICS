package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Freuency_of_char {
public static void main(String[] args) {
	String s="abbacddee";
	Map<Character, Integer> m=new LinkedHashMap<>();
	for(char x:s.toCharArray()) {
		m.put(x, m.getOrDefault(x, 0)+1);
	}
	for(Entry<Character, Integer> y: m.entrySet()) {
		System.out.println(y.getKey()+" "+y.getValue());
	}
}
}
