package com.ds.algorithm.sort.bubble;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 46, 40, 32, 24, 16, 20, 50, 7 };
		boolean swapped = true;

		do {
			swapped = false;

			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int a = array[j];
					array[j] = array[j + 1];
					array[j + 1] = a;
					swapped = true;
				}
			}

		} while (swapped);

		System.out.println(Arrays.toString(array));
	}
}
