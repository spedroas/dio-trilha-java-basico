import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
          // Criando um objeto Scanner para ler a entrada do usuário
          Scanner scanner = new Scanner(System.in);
          // Solicitando e lendo um texto
          System.out.print("\nPor favor, digite seu nome: ");
          String textoNome = scanner.nextLine();
        // Solicitando e lendo um valor inteiro
          System.out.print("\nPor favor, Digite o número de sua Agência sem o dígito: ");
          String numeroAgencia = scanner.nextLine();
        // 
          System.out.print("\nPor favor, Digite o número de sua Conta: ");
          int numeroConta = scanner.nextInt();
         //
          System.out.print("\nDigite o valor a ser depositado: ");
          double numeroSaldo = scanner.nextDouble();
          scanner.nextLine(); // Limpar o buffer do teclado
          // Fechando o scanner
          scanner.close();
          // Exibindo os valores no terminal
          System.out.println("\nOlá "+textoNome+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+numeroSaldo+" já está disponível para saque.\n"); 
    }
}
