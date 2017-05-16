import java.util.Scanner;

public class IceCreamParlor {

	public static void main(String[] args) {
		System.out.println("init");
		Scanner in = new Scanner(System.in);

		int qtdTest = in.nextInt();
		String[] arrSaida = new String[qtdTest * 2];

		int contador = 0;
		for (int i = 0; i < qtdTest; i++) {
			int valorCarteira = in.nextInt();
			int qtdSabores = in.nextInt();
			int[] arr = new int[qtdSabores];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = in.nextInt();
			}

			for (int x = 0; x < arr.length; x++) {
				for (int j = 0; j < arr.length; j++) {
					if (x != j) {
						int soma = arr[x] + arr[j];
						if (valorCarteira == soma) {
							arrSaida[contador++] = (x + 1 + " " + (j + 1));
							break;
						}
					}

				}
			}

		}

		for (int t = 0; t < arrSaida.length; t++) {
			if (t % 2 == 0) {
				System.out.println(arrSaida[t]);
			}
		}

	}
}