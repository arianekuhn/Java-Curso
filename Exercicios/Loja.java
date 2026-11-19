public class Loja {
	public static void main (String [] args) {

	Produto produto1 = new Produto("Caderno", 29.90, 30);
	Produto produto2 = new Produto("Estojo", 49.90, 20);
	Produto produto3 = new Produto("Carrinho", 119.90, 5);

	produto1.exibirInformacoes();
	produto2.exibirInformacoes();
	produto3.exibirInformacoes();
	
	}
}