import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GamingArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		for (int a0 = 0; a0 < g; a0++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			List<Integer> m = new ArrayList<Integer>();

			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}

			int current = 0, max = 0;
			int j = 0, index = 0;
			while (j != arr.length) {
				current = arr[j];
				if (current > max) {
					max = current;
					m.add(index++, j);
				}
				j++;
			}

			if (m.size() % 2 == 0) {
				System.out.println("ANDY");
			} else {
				System.out.println("BOB");
			}

		}
	}
}