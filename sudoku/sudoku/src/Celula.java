/**
 * Representa uma célula individual do tabuleiro Sudoku.
 * Armazena o valor da célula e seu estado (se é fixa ou editável).
 */
public class Celula {
    private int valor;      // Valor da célula (0 para vazia)
    private final boolean fixa;   // Se true, não pode ser alterada pelo jogador

    /**
     * Construtor para célula vazia editável
     */
    public Celula() {
        this.valor = 0;
        this.fixa = false;
    }

    /**
     * Construtor para célula com valor específico
     * @param valor Valor da célula (1-9)
     * @param fixa Se é fixa (pré-definida) ou não
     */
    public Celula(int valor, boolean fixa) {
        this.valor = valor;
        this.fixa = fixa;
    }

    // Getters e Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (!this.fixa) {  // Só permite alterar se não for fixa
            this.valor = valor;
        }
    }

    public boolean isFixa() {
        return fixa;
    }

    public boolean estaVazia() {
        return valor == 0;
    }

    @Override
    public String toString() {
        return estaVazia() ? " " : Integer.toString(valor);
    }
}
