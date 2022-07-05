package by.epam.tr.main;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// 3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
		// встречается раньше - положительное или отрицательное.
		Random rnd = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(-1, 1);
			System.out.print("[" + array[i] + "]");
		}
		if (array[0] > 0) {
			System.out.println("\nPositive [" + array[0] + "]");
		} else if (array[0] < 0) {
			System.out.println("\nNegative [" + array[0] + "]");
		} else {
			System.out.println("\nNumber isn't negative or positive [" + array[0] + "]");

		}

	}

}
