import java.io.*;
import java.util.*;

public class MissingNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int qtd = in.nextInt();
		Integer[] A = new Integer[qtd];
		for (int j = 0; j < qtd; j++) {
			A[j] = in.nextInt();
		}

		int qte = in.nextInt();
		Integer[] B = new Integer[qte];
		for (int i = 0; i < qte; i++) {
			B[i] = in.nextInt();
		}

		int[] test = new int[201];
		int p = A[0];

		for (int i = 0; i < A.length; i++) {
			int d = A[i] - p;
			test[100 + d]--;
		}

		for (int i = 0; i < B.length; i++) {
			int d = B[i] - p;
			test[100 + d]++;
		}

		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i]; j++) {
				int saida = i - 100 + p;
				System.out.print(saida + " ");
			}
		}

		// }

	}
}