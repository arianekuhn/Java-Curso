public class DiasNoMes {
    public static void main(String[] args) {

        String mes = "Fevereiro";

        String dias = switch (mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "31 dias";
            case "Abril", "Junho", "Setembro", "Novembro" -> "30 dias";
            case "Fevereiro" -> "28 dias";
            default -> "Mês Desconhecido";
        };

        System.out.println(mes + " tem " + dias);
    }
}