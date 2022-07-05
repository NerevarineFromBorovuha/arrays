package by.epam.tr.main;

public class Ex19 {

	public static void main(String[] args) {
		// 19. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):
		int n = 8;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 1;
			}
		}

		for (int j = 0; j < array.length / 2; j++) {
			for (int i = 1+j; i < array.length-j-1; i++) {
				array[i][j] = 0;
			}
		}
		for (int j = array.length-1,k=0; j > array.length/2; j--,k++) {
			for (int i = 1+k; i < array.length-1-k; i++) {
				array[i][j] = 0;
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
