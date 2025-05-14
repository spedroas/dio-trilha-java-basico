// Classe Cliente
public class Cliente {
    private String nome;
    private String cpf;
    
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
}

// Interface Conta
interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
}

  

