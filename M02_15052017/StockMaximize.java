import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StockMaximize {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int N = in.nextInt();
			int[] prices = new int[N];
			for (int prices_i = 0; prices_i < N; prices_i++) {
				prices[prices_i] = in.nextInt();

			}

			System.out.print(help(prices));
		}
	}

	public static long help(int[] valores) {
		long lucro = 0L;
		int maximo = 0;

		for (int i = valores.length - 1; i > -1; i--) {
			if (valores[i] >= maximo) {
				maximo = valores[i];
			}
			lucro = (lucro + maximo) - valores[i];
		}
		return lucro;
	}
}
