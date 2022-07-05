package by.epam.tr.main;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		// 6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
		// элемент больше последнего
		int[][] array = new int[5][8];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(100);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j+=2) {
				if (array[0][j]>array[array.length-1][j])
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
