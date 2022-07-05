package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых
		// остаток от деления на М равен L (0 < L < М-1).
		Random rnd = new Random();
		int[] array = new int[30];

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
			System.out.print("[" + array[i] + "]");
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);

		int m;
		int l;

		System.out.print("Press M > ");
		m = sc.nextInt();
		System.out.print("Press L (0<L<M-1) > ");
		l = sc.nextInt();

		if ((0 < l) & (l < (m - 1))) {
		} else {
			System.out.println("M isn't = (0<L<M-1)");
			return;
		}
		for (int i = 0; i < array.length; i++) {
			if ((array[i] % m) == l) {
				System.out.print("[" + array[i] + "]");
			}

		}

	}

}
