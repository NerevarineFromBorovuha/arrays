package by.epam.tr.main;

import java.util.Random;

public class Ex16 {

	public static void main(String[] args) {
		// 16. Даны действительные числа n a ,a , ,a 1 2  . Найти max( , , , )
		Random rnd = new Random();
		int n = 10;
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(10);
			System.out.print("[" + array[i] + "]");
		}
		int[] array2 = new int[n / 2];
		System.out.println();

		for (int i = 0, j = 0; i < array.length; i++, j++) {
			if (i < (array.length - i)) {
				array2[j] = (array[i] + array[array.length - i - 1]);

				System.out.print("[" + array2[j] + "]");
			} else {
				break;
			}
		}

		int max = array2[0];

		for (int i = 1; i < array2.length; i++) {
			if (array2[i] > max) {
				max = array2[i];
			}
		}
		System.out.println("\nmax= " + max);
	}
}
