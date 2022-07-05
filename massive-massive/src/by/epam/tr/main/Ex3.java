package by.epam.tr.main;

import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// 3. Дана матрица. Вывести на экран первый и последний столбцы.
		int[][] array = new int[5][5];
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
			System.out.printf("[%4d]\n", array[i][0]);
		}
		System.out.println("----------------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%4d]\n", array[i][array[i].length - 1]);
		}

	}

}
