package es.jr.leetcode.sols;

import java.util.Arrays;

public class SubRectangle {
	
	int[][] array;
	
	public static void main(String[] args) {
		int[][] a = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
		SubRectangle obj = new SubRectangle(a);
		
		System.out.println(obj.getValue(0, 2));
		obj.updateSubrectangle(0, 0, 3, 2, 5);
		System.out.println(obj.getValue(0, 2));
		/**
		 * Your SubrectangleQueries object will be instantiated and called as such:
		 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
		 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
		 * int param_2 = obj.getValue(row,col);
		 */
	
	}

	public SubRectangle(int[][] rectangle) {
		array = new int[rectangle.length][rectangle[0].length];
		
		for (int i = 0; i < rectangle.length; i++) {
			System.arraycopy(rectangle[i], 0, array[i], 0, rectangle[i].length);	
		}
		printRectangle();
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i < array.length && i <= row2 ; i++) {
			for (int j = col1; j < array[i].length && j <= col2; j++) {
				array[i][j] = newValue;
			}
		}
        printRectangle();
    }
    
    
    public void printRectangle() {
		for (int i = 0; i < array.length; i++) {	
			System.out.println(Arrays.toString(array[i]));
		}
		System.out.println("\n");
    }
    
    public int getValue(int row, int col) {
        return array[row][col];
    }
	
	public static void swap(int[] arr, int i, int j) {
	    arr[i] = (arr[i] + arr[j]) - (arr[j] = arr[i]);
	}
}
