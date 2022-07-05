package by.epam.tr.main;

import java.util.Random;

public class Ex14 {

	public static void main(String[] args) {
		// Дан одномерный массив A[N]. Найти:
		Random rnd = new Random();
		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
			System.out.print("[" + array[i] + "]");
		}
		System.out.println();
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.print("[" + array[i] + "]");
				if (array[i] > max) {
					max = array[i];
				}
			}
		}
		System.out.println("\nmax=" + max);
		for (int i = 1; i < array.length; i++) {
			if (i % 2 != 0) {
				System.out.print("[" + array[i] + "]");
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		System.out.println("\nmin=" + min);
		System.out.println("sum = " + (min + max));

	}

}
