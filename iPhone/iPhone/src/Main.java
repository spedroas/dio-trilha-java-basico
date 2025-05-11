public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 15", "123456789");
        
        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Bohemian Rhapsody");
        meuIphone.tocar();
        meuIphone.pausar();
        
        // Testando Aparelho Telefônico
        meuIphone.ligar("11987654321");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando Navegador Internet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

