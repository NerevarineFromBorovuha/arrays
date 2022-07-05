package by.epam.tr.main;

public class Ex17 {

	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
		int n = 6;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if ((i == 0) | (i == array.length - 1)) {
					array[i][j] = 1;
				} else {
					array[i][0] = 1;
					array[i][array.length - 1] = 1;
				}

				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
