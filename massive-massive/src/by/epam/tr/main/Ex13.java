package by.epam.tr.main;

public class Ex13 {

	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
		int n = 6;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		///////////////////////////////////////
		for (int i = 0; i < array.length; i++) {
			if ((i == 0) | (i % 2 == 0)) {
				for (int j = 0, k = array.length - 1; j < array[i].length; j++) {
					array[i][j] = array.length - k;
					k--;
				}
			} else {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = array.length - j;

				}
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
