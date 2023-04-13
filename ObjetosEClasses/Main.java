package ObjetosEClasses;

import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- INFORME OS DADOS DO SEU VEÍCULO ---");
        System.out.println("--------------------");

            //coleta de informações obrigatórias
            System.out.println("Informe abaixo os dados obrigatórios:");

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
            
            //Novo instância da classe Carro para informações fornecidas pelo usuário
            Carro meuCarro = new Carro(numPortas, numChassi, anoFabricacao, combustivel);
            meuCarro.setcor(cor);
            meuCarro.setmodel(modelo);
            meuCarro.setautomatico(automatico);
            meuCarro.setarCondicionado(arCondicionado);
            
            //Exibe as informações do carro
            meuCarro.exibirCarro();

            scanner.close();
    }
}