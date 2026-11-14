public class Aprovacao {
    public static void main(String[] args) {

        int nota1 = 3;
        int nota2 = 1;

        int media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}