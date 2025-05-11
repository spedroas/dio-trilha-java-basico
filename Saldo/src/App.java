import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Configura o Scanner para usar padrão americano (ponto como separador decimal)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // Entrada das três transações
        double transacao1 = scanner.nextDouble();
        double transacao2 = scanner.nextDouble();
        double transacao3 = scanner.nextDouble();

        // Cálculo do saldo final
        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        // Saída formatada com 2 casas decimais
        System.out.printf(Locale.US, "%.2f%n", saldoFinal);

        scanner.close();
    }
}