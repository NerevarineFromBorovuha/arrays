package by.epam.tr.main;

public class Ex16 {

	public static void main(String[] args) {
		// 16. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		int n = 6;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					array[i][j] = (i + 1) * (i + 2);

				}
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
