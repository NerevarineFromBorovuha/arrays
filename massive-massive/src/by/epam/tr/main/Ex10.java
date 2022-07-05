package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 10. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		int[][] array = new int[5][5];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rnd.nextInt(10);
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string number   >");
		int string = sc.nextInt();
		System.out.print("Enter column number   >");
		int column = sc.nextInt();
		if ((string >= array.length) | (column >= array.length)) {
			System.out.println("Column or string isn't correct");
			return;
		}
		if ((string < 0) | (column <0)) {
			System.out.println("Column or string isn't correct");
			return;
		}
		System.out.println("String  " + string);
		for (int j = 0; j < array.length; j++) {
			System.out.printf("[%4d]", array[string][j]);
		}

		System.out.println("\nColumn  " + column);
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%4d]\n", array[i][column]);
		}

	}

}
