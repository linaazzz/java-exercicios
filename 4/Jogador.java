import java.util.Scanner;

public class Jogador {
        private String nome;
        private float pontuacao;
        private int nivel;
    
        Jogador(String nome, float pontuacao, int nivel) { // funcao pra pedir informacao
            this.nome = nome;
            this.pontuacao = pontuacao;
            this.nivel = nivel;
        }
    
        public void subirNivel() {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Quantos níveis o jogador subiu?");
            int niveisganhados = leitor.nextInt();
            nivel = nivel + niveisganhados;
        }

        public void AumentarPontuacao(){
            Scanner leitor = new Scanner(System.in);
            System.out.print("Quanto de pontuação o jogador subiu?");
            float pontuacaoganhada = leitor.nextFloat();
            pontuacao = pontuacao + pontuacaoganhada;
        }
    
        public void exibirInformacoes() {
            System.out.println("Nome do jogador: " + this.getNome());
            System.out.println("Pontuação: " + this.getPontuacao());
            System.out.println("Nível: " + this.getNivel());
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public float getPontuacao() {
            return pontuacao;
        }
    
        public void setPontuacao(float pontuacao) {
            this.pontuacao = pontuacao;
        }
    
        public int getNivel() {
            return nivel;
        }
    
        public void setNivel(int nivel) {
            this.nivel = nivel;
        }
    }
    
