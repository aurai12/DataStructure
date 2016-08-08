package com.ds.algorithm.sort.selection;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 46, 40, 32, 24, 16, 20, 50, 7 };

		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}

			int a = array[i];
			array[i] = array[minIndex];
			array[minIndex] = a;
		}

		System.out.println(Arrays.toString(array));
	}
}
