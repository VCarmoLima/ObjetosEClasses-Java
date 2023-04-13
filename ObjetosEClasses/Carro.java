package ObjetosEClasses;

/**
 * Carro
 */
class Carro {
    //métodos obrigatórios
    private int numPortas;
    private String numChassi;
    private int anoFabricacao;
    private String combustivel;

    //métodos opcionais
    private String cor;
    private String modelo;
    private boolean automatico;
    private boolean arCondicionado;

    public Carro (int numPortas, String numChassi, int anoFabricacao, String combustivel) {
        this.numPortas = numPortas;
        this.numChassi = numChassi;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public void setmodel(String modelo) {
        this.modelo = modelo;
    }

    public void setautomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public void setarCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void exibirCarro() {
        System.out.println("Modelo " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Número de portas: " + numPortas);
        System.out.println("Número do chassi: " + numChassi);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Tipo de combustível: " + combustivel);
        System.out.println("Automático: " + automatico);
        System.out.println("Ar condicionado: " + arCondicionado);
    }
}