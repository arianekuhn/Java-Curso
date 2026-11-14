public class AprovacaoFrequencia {
    public static void main(String[] args) {

        double nota1 = 3;
        double nota2 = 1;
        double frequencia = 60.02;

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && frequencia >= 75.00) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        System.out.println("Média: " + media);
        System.out.println("Frequência: " + frequencia + "%");
    }
}