package es.jr.leetcode.sols;

import java.util.Arrays;

public class Permutations {

	public Permutations() {};
	
	public static void main(String[] args) {
		new Permutations().nextPermutation(new int[] {7,8,9});
	}

    public void nextPermutation(int[] nums) {
    	
    	for (int i = 0; i < nums.length-1; i++) {
    		
    		if(nums[i] > nums[i+1]) {				
				swap(nums, i, i+1);	i++;				
				System.out.println(Arrays.toString(nums));
			}
		}
    	
//    	swap(nums, 1, 2);
    	
    	System.out.println(Arrays.toString(nums));
    }
	
	public static void swap(int[] arr, int i, int j) {
	    arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
	}
}
