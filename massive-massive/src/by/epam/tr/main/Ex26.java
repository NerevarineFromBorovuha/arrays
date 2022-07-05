package by.epam.tr.main;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// 26. С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить
		// с массивом следующие действия:
		// а) вычислить сумму отрицательных элементов в каждой строке;
		// б) определить максимальный элемент в каждой строке;
		// в) переставить местами максимальный и минимальный элементы матрицы.

		Scanner sc = new Scanner(System.in);
		System.out.print("Press n > ");
		int n = sc.nextInt();
		System.out.print("Press m > ");
		int m = sc.nextInt();
		int array[][] = new int[n][m];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("array[" + i + "] [" + j + "] =>");
				array[i][j] = sc.nextInt();
			}
		}

		System.out.println("------------------------------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		// а) вычислить сумму отрицательных элементов в каждой строке;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < 0) {
					sum = sum + array[i][j];
				}
			}
			System.out.println("sum negative numbers in " + i + " string = " + sum);
			sum = 0;
		}
		// б) определить максимальный элемент в каждой строке;
		int max;
		for (int i = 0; i < array.length; i++) {
			max = array[i][0];
			for (int j = 1; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}

			}
			System.out.println("max number in " + i + " string = " + max);

		}

		// в) переставить местами максимальный и минимальный элементы матрицы.
		int maxCountI = 0;
		int maxCountJ = 0;
		int minCountI = 0;
		int minCountJ = 0;
		int maxAll = array[0][0];
		int minAll = array[0][0];
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j++) {
				if (array[i][j] > maxAll) {
					maxAll = array[i][j];
					maxCountI = i;
					maxCountJ = j;
				}
				if (array[i][j] < minAll) {
					minAll = array[i][j];
					minCountI = i;
					minCountJ = j;
				}
			}

		}
		int temp = 0;
		temp = array[maxCountI][maxCountJ];
		array[maxCountI][maxCountJ] = array[minCountI][minCountJ];
		array[minCountI][minCountJ] = temp;
		System.out.println("maxAll number = " + maxAll);
		System.out.println("minAll number = " + minAll);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
	}
}
