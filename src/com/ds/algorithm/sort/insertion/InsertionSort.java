package com.ds.algorithm.sort.insertion;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 46, 40, 32, 24, 16, 20, 24, 50, 7 };

		for (int i = 1; i < array.length; i++) {
			int element = array[i];

			for (int j = i; j > 0; j--) {
				if (array[j - 1] > element) {
					int a = array[j - 1];
					array[j - 1] = element;
					array[j] = a;
				} else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
}
