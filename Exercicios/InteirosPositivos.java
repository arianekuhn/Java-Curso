public class InteirosPositivos {
	public static void main(String [] args) {
		int numero = 10;
		int soma = 0;
		int i = 1;

		do {
			soma = soma + i;
			i++;

		} while (i <= numero);

		System.out.println(soma);
	}
}