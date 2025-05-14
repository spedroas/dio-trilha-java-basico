  // Classe ContaCorrente
public class ContaCorrente extends Conta {
    private static final double TAXA_MANUTENCAO = 12.90;
    
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Taxa de manutenção: R$%.2f", TAXA_MANUTENCAO));
    }
    
    public void cobrarTaxa() {
        this.saldo -= TAXA_MANUTENCAO;
        System.out.println("Taxa de manutenção de R$" + TAXA_MANUTENCAO + 
                         " cobrada na conta " + this.getNumero());
    }
}
  

