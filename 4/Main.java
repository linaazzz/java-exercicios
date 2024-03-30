import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Bem vindo! O que gostaria de fazer?");
            System.out.println("1. Adicionar um jogador.");
            System.out.println("2. Atualizar a pontuação de um jogador.");
            System.out.println("3. Atualizar o nível de um jogador.");
            System.out.println("4. Exibir jogadores.");
            System.out.println("5. Encerrar o programa.");
            opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do jogador:");
                    String nome = leitor.nextLine();

                    System.out.println("Digite a pontuação do jogador:");
                    float pontuacao = leitor.nextFloat();
                    leitor.nextLine(); 

                    System.out.println("Digite o nível do jogador:");
                    int nivel = leitor.nextInt();
                    leitor.nextLine(); 

                    Jogador jogador = new Jogador(nome, pontuacao, nivel);
                    jogadores.add(jogador);
                    break;

                case 2:
                    if (jogadores.size() > 0) {
                        System.out.println("Escolha o jogador para aumentar a pontuação:");
                        for (int i = 0; i < jogadores.size(); i++) {
                            System.out.println((i + 1) + ". " + jogadores.get(i).getNome());
                        }
                        int escolha = leitor.nextInt();
                        leitor.nextLine(); 

                        if (escolha >= 1 && escolha <= jogadores.size()) {
                            Jogador jogadorEscolhido = jogadores.get(escolha - 1);
                            jogadorEscolhido.AumentarPontuacao();
                            System.out.println("Após aumentar a pontuação:");
                            jogadorEscolhido.exibirInformacoes();
                        } else {
                            System.out.println("Nenhum jogador foi adicionado ainda.");
                        }
                    }
                    break;

                case 3:
                    if (jogadores.size() > 0) {
                        System.out.println("Escolha o jogador para subir de nível:");
                        for (int i = 0; i < jogadores.size(); i++) {
                            System.out.println((i + 1) + ". " + jogadores.get(i).getNome());
                        }
                        int escolha = leitor.nextInt();
                        leitor.nextLine(); 

                        if (escolha >= 1 && escolha <= jogadores.size()) {
                            Jogador jogadorEscolhido = jogadores.get(escolha - 1);
                            jogadorEscolhido.subirNivel();
                            System.out.println("Após subir de nível:");
                            jogadorEscolhido.exibirInformacoes();
                        } else {
                            System.out.println("Escolha inválida!");
                        }
                    } else {
                        System.out.println("Nenhum jogador foi adicionado ainda.");
                    }
                    break;

                case 4:
                    if (jogadores.size() > 0) {
                        System.out.println("Informações dos jogadores:");
                        for (int i = 0; i < jogadores.size(); i++) {
                            System.out.println("Jogador " + (i + 1) + ":");
                            jogadores.get(i).exibirInformacoes();
                        }
                    } else {
                        System.out.println("Nenhum jogador foi adicionado ainda.");
                    }
                    break;
            }
        } while (opcao != 5);
    }
}
