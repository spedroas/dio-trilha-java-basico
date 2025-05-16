/**
 * Representa o tabuleiro completo do Sudoku com 9x9 células.
 * Gerencia a lógica de verificação de regras do jogo.
 */
public class Tabuleiro {
    private final Celula[][] celulas;
    private static final int TAMANHO = 9;

    /**
     * Construtor que inicializa um tabuleiro vazio
     */
    public Tabuleiro() {
        celulas = new Celula[TAMANHO][TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                celulas[i][j] = new Celula();
            }
        }
    }

    /**
     * Inicializa o tabuleiro com alguns valores fixos (dica inicial)
     */
    public void inicializarTabuleiro() {
        // Exemplo de tabuleiro inicial (pode ser substituído por um gerador)
        int[][] exemplo = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (exemplo[i][j] != 0) {
                    celulas[i][j] = new Celula(exemplo[i][j], true);
                }
            }
        }
    }

    /**
     * Exibe o tabuleiro no console
     */
    public void exibir() {
        System.out.println("  1 2 3   4 5 6   7 8 9");
        System.out.println(" +-------+-------+-------+");
        
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print((i+1) + "| ");
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print(celulas[i][j] + " ");
                if (j == 2 || j == 5) {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
            if (i == 2 || i == 5) {
                System.out.println(" +-------+-------+-------+");
            }
        }
        System.out.println(" +-------+-------+-------+");
    }

    /**
     * Verifica se um movimento é válido
     * @param linha Linha (1-9)
     * @param coluna Coluna (1-9)
     * @param valor Valor a ser inserido (1-9)
     * @return true se o movimento é válido
     */
    public boolean movimentoValido(int linha, int coluna, int valor) {
        // Verifica se a célula é fixa
        if (celulas[linha-1][coluna-1].isFixa()) {
            return false;
        }

        // Verifica se o valor já existe na linha
        for (int j = 0; j < TAMANHO; j++) {
            if (celulas[linha-1][j].getValor() == valor) {
                return false;
            }
        }

        // Verifica se o valor já existe na coluna
        for (int i = 0; i < TAMANHO; i++) {
            if (celulas[i][coluna-1].getValor() == valor) {
                return false;
            }
        }

        // Verifica se o valor já existe no quadrante 3x3
        int quadranteLinha = (linha-1) / 3;
        int quadranteColuna = (coluna-1) / 3;
        
        for (int i = quadranteLinha*3; i < (quadranteLinha+1)*3; i++) {
            for (int j = quadranteColuna*3; j < (quadranteColuna+1)*3; j++) {
                if (celulas[i][j].getValor() == valor) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Insere um valor no tabuleiro
     * @param linha Linha (1-9)
     * @param coluna Coluna (1-9)
     * @param valor Valor a ser inserido (1-9)
     * @return true se a inserção foi bem sucedida
     */
    public boolean inserirValor(int linha, int coluna, int valor) {
        if (movimentoValido(linha, coluna, valor)) {
            celulas[linha-1][coluna-1].setValor(valor);
            return true;
        }
        return false;
    }

    /**
     * Verifica se o tabuleiro está completo e correto
     * @return true se o tabuleiro está completo e válido
     */
    public boolean estaCompleto() {
        // Verifica se todas as células estão preenchidas
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (celulas[i][j].estaVazia()) {
                    return false;
                }
            }
        }

        // Verifica todas as linhas, colunas e quadrantes
        for (int n = 0; n < TAMANHO; n++) {
            if (!verificarLinha(n) || !verificarColuna(n) || !verificarQuadrante(n)) {
                return false;
            }
        }

        return true;
    }

    private boolean verificarLinha(int linha) {
        boolean[] numeros = new boolean[TAMANHO+1];
        for (int j = 0; j < TAMANHO; j++) {
            int num = celulas[linha][j].getValor();
            if (numeros[num]) {
                return false;
            }
            numeros[num] = true;
        }
        return true;
    }

    private boolean verificarColuna(int coluna) {
        boolean[] numeros = new boolean[TAMANHO+1];
        for (int i = 0; i < TAMANHO; i++) {
            int num = celulas[i][coluna].getValor();
            if (numeros[num]) {
                return false;
            }
            numeros[num] = true;
        }
        return true;
    }

    private boolean verificarQuadrante(int quadrante) {
        boolean[] numeros = new boolean[TAMANHO+1];
        int linhaInicio = (quadrante / 3) * 3;
        int colunaInicio = (quadrante % 3) * 3;
        
        for (int i = linhaInicio; i < linhaInicio+3; i++) {
            for (int j = colunaInicio; j < colunaInicio+3; j++) {
                int num = celulas[i][j].getValor();
                if (numeros[num]) {
                    return false;
                }
                numeros[num] = true;
            }
        }
        return true;
    }
}
