import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
          // Criando um objeto Scanner para ler a entrada do usuário
          Scanner scanner = new Scanner(System.in);
          // Solicitando um texto
          System.out.print("\nPor favor, digite seu nome: ");
          String textoNome = scanner.nextLine();
        // Solicitando um texto
          System.out.print("\nPor favor, Digite o número de sua Agência sem o dígito: ");
          String numeroAgencia = scanner.nextLine();
        // Solicitando um inteiro
          System.out.print("\nPor favor, Digite o número de sua Conta: ");
          int numeroConta = scanner.nextInt();
         //Solicitando um double
          System.out.print("\nDigite o valor a ser depositado: ");
          double numeroSaldo = scanner.nextDouble();
          scanner.nextLine(); // Limpar o buffer do teclado
          // Fechando o scanner
          scanner.close();
          // Exibindo os valores no terminal
          System.out.println("\nOlá "+textoNome+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+numeroSaldo+" já está disponível para saque.\n"); 
    }
}
