import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int entrada;
		int aux = 0;
		
		List<Integer> saida = new ArrayList<Integer>();
		
		entrada = sc.nextInt();
		String[] arrayString = new String[entrada];

		for (int i = 0; i < entrada; i++) {
			arrayString[i] = sc.next();
		}

		int proximoQuery = sc.nextInt();
		for (int i = 0; i < proximoQuery; i++) {
			int intAux = 0;
			String stringAux = sc.next();
			
			for (int j = 0; j < entrada; j++) {
				if (stringAux.equals(arrayString[j])) {
					intAux++;
				}
			}
			
			saida.add(intAux);
			aux++;
		}

		for (int i = 0; i < saida.size(); i++) {
			System.out.println(saida.get(i));
		}
	}
}