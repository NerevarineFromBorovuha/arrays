package by.epam.tr.main;

public class Ex12 {

	public static void main(String[] args) {
		// 12. Получить квадратную матрицу порядка n:
		int n = 5;
		int[][] array = new int[n][n];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					array[i][j] = i;
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
