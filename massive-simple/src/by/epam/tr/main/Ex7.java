package by.epam.tr.main;

import java.util.Random;

public class Ex7 {

	public static void main(String[] args) {
		// 7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все
		// ее члены, большие данного Z, этим числом. Подсчитать количество замен.
		Random rnd = new Random();
		int[] array = new int[10];
		int z = 5;
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(10);
			System.out.print("[" + array[i] + "]");
		}
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > z) {
				count++;
			}
		}
		System.out.print("\ncount = " + count);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > z) {
				array[i] = z;
			}

		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}
}
