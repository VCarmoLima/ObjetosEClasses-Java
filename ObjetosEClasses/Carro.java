package ObjetosEClasses;

import java.util.Scanner;

/**
 * Maim
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- INFORME OS DADOS DO SEU VEÍCULO ---");
        System.out.println("--------------------");
        scanner.nextLine();

            //coleta de informações obrigatórias
            System.out.println("Informe abaixo os dados obrigatórios:");
            scanner.nextLine();

                System.out.print("Número de portas: ");
                int numPortas = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Número do Chassi: ");
                String numChassi = scanner.nextLine();
                
                System.out.print("Ano de fabricação: ");
                int anoFabricacao = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Tipo do combustível: ");
                String combustivel = scanner.nextLine();

            //coleta de informações opcionais
            System.out.println("Informe abaixo os dados opcionais:");
            scanner.nextLine();

                System.out.print("Qual a cor do veículo?: ");
                String cor = scanner.nextLine();
                
                System.out.print("Qual o modelo do veículo?: ");
                String modelo = scanner.nextLine();
                
                System.out.print("O veículo é automático? (sim/não): ");
                boolean automatico = scanner.nextBoolean();
                scanner.nextLine();

                System.out.print("O veículo possui Ar Condicionado? (sim/não): ");
                boolean arCondicionado = scanner.nextBoolean();
                scanner.nextLine();
    
    }
}


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
