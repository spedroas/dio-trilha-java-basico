  // Classe Banco
  public class Banco {
    private String nome;
    private List<Conta> contas;
    
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
    
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
    
    public void listarContas() {
        System.out.println("\n=== Lista de Contas do " + nome + " ===");
        contas.forEach(Conta::imprimirInfosComuns);
    }
    
    // Getters
    public String getNome() { return nome; }
    public List<Conta> getContas() { return contas; }
}
  

