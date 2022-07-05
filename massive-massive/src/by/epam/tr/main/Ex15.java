package by.epam.tr.main;

public class Ex15 {

	public static void main(String[] args) {
		// 15. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		int n = 6;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					array[i][j] = array.length - i;
					
				}
				System.out.printf("[%4d]", array[i][j]);
			}
			System.out.println();
		}

	}

}
