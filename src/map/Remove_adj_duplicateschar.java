package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Remove_adj_duplicateschar {
public static void main(String[] args) {
	String s="aabbccedda";
	char[] ch=s.toCharArray();
	Map<Character, Integer> m=new LinkedHashMap<>();
	/*for(char x:s.toCharArray()) {
		m.put(x,m.getOrDefault(x, 0)+1);
	}*/
	int j=0;
	for(int i=1;i<ch.length;i++) {
		if(ch[i-1]!=ch[i])
			m.put(ch[i-1], m.getOrDefault(ch[i-1], j+1));
	}
	for(Map.Entry<Character,Integer> y:m.entrySet()) {
		System.out.println(y.getKey()+" "+y.getValue());
		}
		
	}

	}

