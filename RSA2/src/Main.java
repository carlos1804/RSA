import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// passo 1: defina dois numeros primos
		int p = 11;
		int q = 17;

		// passo 2: Calculo de n
		int n = p * q;

		// passo 3: calcule z
		int z = (p - 1) * (q - 1);

		// passo 4: defina d
		int d = 7; // ((2 * z) + 1 ) / e;

		// passo 5 valor de e

		int contador = 0;
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int ee = 2; contador < 1; ee++) {
			if ((ee * d) % z == 1) {
				lista.add(ee);
				contador++;
			}
		}

		int e = lista.get(0);
		System.out.println(p + " " + q);
		System.out.println("n = " + n);
		System.out.println("z = " + z);
		System.out.println("d = " + d);
		System.out.println("e = " + lista);

		// encriptar
		System.out.println("Qual texto você vai criptografar?");
		int textoplano = sc.nextInt();
		int textocifrado = (int) Math.pow((textoplano), e);
		int textocifradofinal = textocifrado % n;
		System.out.println("Texto encriptado: " + textocifradofinal);
		// decriptar
		int Textoplano = (int) Math.pow((textocifrado), d);
		int Textoplanofinal = textoplano % n;
		System.out.println("Texto descriptado: " + Textoplanofinal);
	}
}