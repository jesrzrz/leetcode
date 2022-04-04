package es.jr.leetcode.sols;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public TwoSum() {
	};

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{5,4,2,7,9,15}, 9)));
	}

	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			//detectar num necesario
			Integer requiredNum = target - numbers[i]; 
			//buscarlo en el mapa
			//si coincide devolver resultado
			if(indexMap.containsKey(requiredNum)) {
				return new int[] {i, indexMap.get(requiredNum)};
			}
			indexMap.put(numbers[i], i);
			//si no guardar en el mapa
			
		}
		return null;
	}

}
