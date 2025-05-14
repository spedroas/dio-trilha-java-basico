// Classe ContaPoupanca
public class ContaPoupanca extends Conta {
    private static final double RENDIMENTO = 0.005; // 0.5% ao mês
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Rendimento mensal: %.2f%%", RENDIMENTO * 100));
    }
    
    public void aplicarRendimento() {
        double rendimento = this.saldo * RENDIMENTO;
        this.saldo += rendimento;
        System.out.println(String.format("Rendimento de R$%.2f aplicado na conta %d", 
                                       rendimento, this.getNumero()));
    }
}    

