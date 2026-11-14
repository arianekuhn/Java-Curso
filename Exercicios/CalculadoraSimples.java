public class CalculadoraSimples{
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int soma = 0;
		int subtracao = 0;
		int divisao = 0;
		int multi = 0;

		soma = a + b;
		System.out.println("A soma de: " + a + " e " + b + " é igual a " + soma);


		subtracao = a - b;
		System.out.println("A subtracao de: " + a + " e " + b + " é igual a " + subtracao);


		divisao = a / b;
		System.out.println("A divisao de: " + a + " e " + b + " é igual a " + divisao);


		multi = a * b;
		System.out.println("A multiplicação de: " + a + " e " + b + " é igual a " + multi);


	}
}