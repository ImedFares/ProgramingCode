package leetCode.romainToInetger;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int romanToInt(String s) {
		Map<String, Integer> map = new HashMap();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		map.put("IV", 4);
		map.put("IX", 9);
		map.put("XL", 40);
		map.put("XC", 90);
		map.put("CD", 400);
		map.put("CM", 900);
		if (s.length() > 15)
			return 0;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getKey().equals(s))
				return entry.getValue();
		}
		int total = 0;
		if (!s.equals("IV") || !s.equals("IX") || !s.equals("XL") || !s.equals("XC") || !s.equals("CD")
				|| !s.equals("CM")) {
			for (int i = 0; i < s.length(); i++) {
				String key = String.valueOf(s.charAt(i));
				int s1 = map.get(key);
				if (i + 1 < s.length()) {
					String key2 = String.valueOf(s.charAt(i + 1));
					int s2 = map.get(key2);
					if (s1 >= s2) {
						total = total + s1;
					} else {
						total = total - s1;
					}
				} else {
					total = total + s1;
				}
			}
		}
			return total;
		
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.romanToInt("LXVMC"));
	}
}