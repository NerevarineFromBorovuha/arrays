package by.epam.tr.main;

import java.util.Random;

public class Ex36 {

	public static void main(String[] args) {
		// Сглаживание
		Random rnd = new Random();
		int n = 5;
		int array[][] = new int[n][n];
		int newArray[][] = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(10);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		//////////////////////////////////////////////////////////////////////////////////
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((i == 0) & (j == 0)) {
					newArray[i][j] = (array[i][j + 1] + array[i + 1][j]) / 2;
				} else if ((i == array.length - 1) & (j == 0)) {
					newArray[i][j] = (array[i][j + 1] + array[i - 1][j]) / 2;
				} else if ((i == 0) & (j == array[i].length - 1)) {
					newArray[i][j] = (array[i][j - 1] + array[i + 1][j]) / 2;
				} else if ((i == array.length - 1) & (j == array[i].length - 1)) {
					newArray[i][j] = (array[i][j - 1] + array[i - 1][j]) / 2;

				} else if ((j == 0) & (i > 0) & (i < array.length - 1)) {
					newArray[i][j] = (array[i][j + 1] + array[i + 1][j] + array[i - 1][j]) / 3;
				} else if ((j == array[i].length - 1) & (i > 0) & (i < array.length - 1)) {
					newArray[i][j] = (array[i][j - 1] + array[i + 1][j] + array[i - 1][j]) / 3;
				} else if ((i == 0) & (j > 0) & (j < array[i].length - 1)) {
					newArray[i][j] = (array[i][j - 1] + array[i][j + 1] + array[i + 1][j]) / 3;

				} else if ((i == array.length - 1) & (j > 0) & (j < array[i].length - 1)) {
					newArray[i][j] = (array[i][j - 1] + array[i][j + 1] + array[i + -1][j]) / 3;

				} else {
					newArray[i][j] = (array[i][j + 1] + array[i][j - 1] + array[i + 1][j] + array[i - 1][j]) / 4;
				}

			}

		}

		System.out.println("-----------------------------------------------");
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				System.out.printf("[%4d]", newArray[i][j]);
			}
			System.out.println();
		}

	}

}
