package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// 15. Дана последовательность действительных чисел n a ,a , ,a 1 2  .
		// Указать те ее элементы, которые принадлежат отрезку [с, d]
		Random rnd = new Random();
		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(100);
			System.out.print("[" + array[i] + "]");
		}
		System.out.println("\nArray length is " + array.length);
		Scanner sc = new Scanner(System.in);
		int c;
		int d;
		System.out.print("Press c(c>=0 and c<array length) > ");
		c = sc.nextInt();
		System.out.print("Press d (d>=0 and d<array length) > ");
		d = sc.nextInt();

		if ((c < d) & (d < array.length) & (c >= 0) & (d >= 0)) {
		} else {
			System.out.println("wrong");
			return;
		}
		for (int i = c; i <= d; i++) {
			System.out.print("[" + array[i] + "]");
		}
	}

}
