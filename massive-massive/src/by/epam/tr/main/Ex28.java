package by.epam.tr.main;

import java.util.Random;

public class Ex28 {

	public static void main(String[] args) {
		// 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
		// столбце. Определить, какой столбец содержит максимальную сумму
		Random rnd = new Random();
		int n = 4;
		int array[][] = new int[n][n];
		int newArray[] = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(15);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		int sum = 0;
		for (int j = 0; j < array.length; j++) {
			sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum = sum + array[i][j];
				newArray[j] = sum;
			}

			System.out.println("sum " + j + " column = " + sum);
		}
		System.out.println();
		int max = newArray[0];
		int count = 0;
		for (int i = 1; i < newArray.length; i++) {
			if (newArray[i] > max) {
				max = newArray[i];
				count = i + 1;

			}

		}
		System.out.println("max value in column " + count);

	}

}
