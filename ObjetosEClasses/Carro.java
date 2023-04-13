package ObjetosEClasses;

/**
 * Carro
 */
public class Carro {
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

}
