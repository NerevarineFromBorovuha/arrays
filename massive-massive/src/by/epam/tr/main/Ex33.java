package by.epam.tr.main;

import java.util.Random;

public class Ex33 {

	public static void main(String[] args) {
		// 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
		Random rnd = new Random();

		int array[][] = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(15);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------(sort -)-------------------");
		int max;
		int temp;

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				max = i;
				for (int k = i + 1; k < array.length; k++) {
					if (array[k][j] > array[max][j]) {
						max = k;
					}
				}
				temp = array[i][j];
				array[i][j] = array[max][j];
				array[max][j] = temp;

			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		int min;
		temp = 0;
		System.out.println("------------------(sort +)-------------------");
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				min = i;
				for (int k = i + 1; k < array.length; k++) {
					if (array[k][j] < array[min][j]) {
						min = k;
					}
				}
				temp = array[i][j];
				array[i][j] = array[min][j];
				array[min][j] = temp;

			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
