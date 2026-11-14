public class carteirinhaConvenio {
	public static void main (String []args) {

		int codigoDeSaida = 10;

		for (int codigoCarteirinha = 1; codigoCarteirinha < 10; codigoCarteirinha++) {

			if (codigoCarteirinha == codigoDeSaida) {

				break;
			}

			if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
				System.out.println("Código " + codigoCarteirinha + " Aceito.");

				continue;
			}

				System.out.println("Código " + codigoCarteirinha + " NÃO aceito.");
		}
 	}
}