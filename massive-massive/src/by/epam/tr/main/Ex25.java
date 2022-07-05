package by.epam.tr.main;

public class Ex25 {

	public static void main(String[] args) {
		// 25. Получить квадратную матрицу порядка n:
		int n = 6;
		int array[][] = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0) {
					array[i][j] = j + 1;
				} else {
					array[i][j] = i * array.length + 1 + j;
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
