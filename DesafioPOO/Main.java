//package dio.me.bank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando o banco
        Banco bancoDIO = new Banco("DIO Bank");
        
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");
        
        // Criando contas
        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente2);
        
        // Adicionando contas ao banco
        bancoDIO.adicionarConta(cc);
        bancoDIO.adicionarConta(cp);
        
        // Operações bancárias
        cc.depositar(1000);
        cc.transferir(500, cp);
        cp.sacar(200);
        
        // Listando contas do banco
        bancoDIO.listarContas();
        
        // Demonstração de polimorfismo
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(cp);
        
        contas.forEach(conta -> {
            conta.imprimirExtrato();
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).aplicarRendimento();
            }
        });
    }
}



