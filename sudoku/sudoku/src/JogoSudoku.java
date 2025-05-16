import java.util.Scanner;

/**
 * Gerencia o fluxo do jogo, interação com o usuário e controle do tabuleiro.
 */
public class JogoSudoku {
    private final Tabuleiro tabuleiro;
    private final Scanner scanner;

    public JogoSudoku() {
        tabuleiro = new Tabuleiro();
        scanner = new Scanner(System.in);
    }

    /**
     * Inicia o jogo
     */
    public void iniciar() {
        System.out.println("Bem-vindo ao Sudoku!");
        tabuleiro.inicializarTabuleiro();
        
        while (!tabuleiro.estaCompleto()) {
            tabuleiro.exibir();
            System.out.println("\nDigite sua jogada (linha coluna valor) ou 0 para sair:");
            
            try {
                int linha = scanner.nextInt();
                if (linha == 0) {
                    System.out.println("Jogo encerrado.");
                    return;
                }
                
                int coluna = scanner.nextInt();
                int valor = scanner.nextInt();
                
                if (linha < 1 || linha > 9 || coluna < 1 || coluna > 9 || valor < 1 || valor > 9) {
                    System.out.println("Valores inválidos! Use números de 1 a 9.");
                    continue;
                }
                
                if (tabuleiro.inserirValor(linha, coluna, valor)) {
                    System.out.println("Movimento válido!");
                } else {
                    System.out.println("Movimento inválido! Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Use o formato: linha coluna valor");
                scanner.nextLine(); // Limpa o buffer
            }
        }
        
        tabuleiro.exibir();
        System.out.println("\nParabéns! Você completou o Sudoku!");
    }
}
