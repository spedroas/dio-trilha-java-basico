public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Atributos
    private String modelo;
    private String numeroSerie;
    
    // Construtor
    public iPhone(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }
    
    // Implementação ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
    
    // Implementação AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    // Implementação NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
    
    // Métodos específicos do iPhone
    public String getModelo() {
        return modelo;
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
}
