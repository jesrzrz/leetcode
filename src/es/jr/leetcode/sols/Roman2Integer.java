package es.jr.leetcode.sols;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Roman2Integer {

	public Roman2Integer() {
	};

	public static void main(String[] args) {
		System.out.println(new Roman2Integer().romanToInt("III"));
	}

	private Map<String, Integer> romanValues = Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000);

	public int romanToInt(String s) {

		int result = 0;

		List<Integer> decValues = Arrays.asList(s.split("")).stream().map(x -> romanValues.get(x))
				.collect(Collectors.toList());
		Collections.reverse(decValues);

		for (int i = 0; i < decValues.size() ; i++) {
			
			
			if (decValues.get(i) > decValues.get(i + 1)) {
				result += decValues.get(i) - decValues.get(i + 1);
			} else {
				result += decValues.get(i);
			}
		}
//		if (decValues.size() > 2) {
//			if (decValues.get(decValues.size() - 1) < decValues.get(decValues.size() - 2)) {
//				result -= decValues.get(decValues.size() - 1);
//			} else {
//				result += decValues.get(decValues.size() - 1);
//			}
//		}

		return result;
	}
}
