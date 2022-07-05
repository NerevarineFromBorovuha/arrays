package by.epam.tr.main;

import java.util.Random;

public class Ex24 {

	public static void main(String[] args) {
		// 24. Дан линейный массив n n x , x , , x , x 1 2 −1  . Получить
		// действительную квадратную матрицу порядка n:
		int n = 6;
		Random rnd = new Random();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(5);
			System.out.printf("[%4d]", array[i]);
		}
		System.out.println("\n----------------------------------------------------------------");
		int newArray[][]=new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < newArray.length; j++) {
				newArray[i][j]=(int)Math.pow(array[j], i+1);
				System.out.printf("[%4d]", newArray[i][j]);
			}
			System.out.println();
		}
		

	}

}
