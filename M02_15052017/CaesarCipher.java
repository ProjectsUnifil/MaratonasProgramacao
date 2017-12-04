import java.util.Scanner;

public class Solucion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();

		String gambiarra = "";

		for (int i = 0; i < n; ++i) {
			if (!Character.isAlphabetic(s.charAt(i))) {
				gambiarra += s.charAt(i);
			} else {
				gambiarra += (retorna(s.charAt(i), k));
			}
		}

		System.out.println(gambiarra);
	}

	public static char retorna(char input, int voltas) {
		int valChar = Character.isLowerCase(input) ? 'a' : 'A';
		int qtdAlfabeto = 26;
		return (char) ((input + voltas - valChar) % qtdAlfabeto + valChar);
	}

}
