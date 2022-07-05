package by.epam.tr.main;

public class Ex14 {

	public static void main(String[] args) {
		// 14. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		int n = 6;
		int[][] array = new int[n][n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][array.length - 1 - i] = i + 1;
			}
		}
		/////////////////////////////////////////////
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
