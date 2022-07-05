package by.epam.tr.main;

public class Ex20 {

	public static void main(String[] args) {
		// 20. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		int n = 8;
		int[][] array = new int[n][n];
		for (int j = 0; j < array.length / 2; j++) {
			for (int i = 0 + j; i < array.length - j; i++) {
				array[i][j] = 1;

			}

		}
		for (int j = array.length - 1, k = 0; j >= array.length / 2; j--, k++) {
			for (int i = 0 + k; i < array.length - k; i++) {
				array[i][j] = 1;
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
