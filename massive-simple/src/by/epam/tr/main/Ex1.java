package by.epam.tr.main;

import java.util.Random;

public class Ex1 {

	public static void main(String[] args) {
		// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
		// которые кратны данному К.
		Random rnd = new Random();
		int[] array = new int[10];
		int sum = 0;
		int k = 2;
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(10);
			System.out.print(array[i] + "_");
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				sum = sum + array[i];
			}

		}
		System.out.println("\nsum = " + sum);


	}

}
