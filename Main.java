import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        int mesAtual = data.getMonthValue();
        int anoAtual = Year.now().getValue();

        Scanner scanner = new Scanner(System.in);

        IO.println("Quando você nasceu?");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Clean the buffer

        if (ano > anoAtual || ano < 1900) {
            IO.println("Ano inválido.");
            return;
        }

        IO.println("Em qual mês?");
        String mesTexto = scanner.nextLine().toLowerCase();

        int mes;

        switch (mesTexto) {
            case "janeiro":
                mes = 1;
                break;
            case "fevereiro":
                mes = 2;
                break;
            case "março":
            case "marco":
                mes = 3;
                break;
            case "abril":
                mes = 4;
                break;
            case "maio":
                mes = 5;
                break;
            case "junho":
                mes = 6;
                break;
            case "julho":
                mes = 7;
                break;
            case "agosto":
                mes = 8;
                break;
            case "setembro":
                mes = 9;
                break;
            case "outubro":
                mes = 10;
                break;
            case "novembro":
                mes = 11;
                break;
            case "dezembro":
                mes = 12;
                break;
            default:
                IO.println("Mês inválido.");
                return;
        }

        int idade = anoAtual - ano;

        if (mes > mesAtual) {
            idade--;
        }

        IO.println("Você tem " + idade + " anos.");
    }
}
