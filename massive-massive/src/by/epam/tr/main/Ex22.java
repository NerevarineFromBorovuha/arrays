package by.epam.tr.main;

public class Ex22 {

	public static void main(String[] args) {
		// 22. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		int n = 6;
		int[][] array = new int[n][n];
		for (int j = 0; j < array.length; j++) {
			for (int i = 0,k=1; i < array.length - j; i++,k++) {
				array[i][j] = k+j;
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
