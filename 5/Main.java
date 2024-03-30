// nesse programa só da pra adicionar um carro
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int opcao;
        Carro carro = null; 
        
        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1. Adicionar o carro.");
            System.out.println("2. Exibir informações do carro.");
            System.out.println("3. Acelerar carro.");
            System.out.println("4. Freiar carro.");
            System.out.println("5. Encerrar.");
            opcao = Integer.parseInt(leitor.nextLine()); 

            switch (opcao) {

                case 1:
                    System.out.print("Digite a marca do carro: ");
                    String marca = leitor.nextLine();
                    System.out.print("Digite o modelo do carro: ");
                    String modelo = leitor.nextLine();
                    System.out.print("Digite o ano do carro: ");
                    int ano = Integer.parseInt(leitor.nextLine()); 
                    System.out.print("Digite a placa do carro: ");
                    String placa = leitor.nextLine();
                    System.out.print("Digite a velocidade atual do carro: ");
                    float velocidadeAtual = Float.parseFloat(leitor.nextLine());
                    
                    carro = new Carro(marca, modelo, ano, placa, velocidadeAtual);
                    break;

                case 2:
                    carro.exibirInformacoes();
                    break;

                case 3:
                    if (carro != null) {
                        System.out.print("Digite a velocidade para acelerar: ");
                        float velocidadeAcelerar = Float.parseFloat(leitor.nextLine()); 
                        carro.acelerar(velocidadeAcelerar);
                    } else {
                        System.out.println("Nenhum carro adicionado ainda.");
                    }
                    break;

                case 4:
                    if (carro != null) {
                        System.out.print("Digite a velocidade para frear: ");
                        float velocidadeFrear = Float.parseFloat(leitor.nextLine()); 
                        carro.frear(velocidadeFrear);
                    } else {
                        System.out.println("Nenhum carro adicionado ainda.");
                    }
                    break;
            }
        } while (opcao != 5);
    }
}
