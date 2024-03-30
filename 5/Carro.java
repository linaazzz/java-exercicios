public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private float velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa, float velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(float velocidade) {
        this.velocidadeAtual += velocidade;
    }

    public void frear(float velocidade) {
        this.velocidadeAtual -= velocidade;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + getVelocidadeAtual() + " km/h");
    }
    
    public float getVelocidadeAtual() {
        return this.velocidadeAtual;
    }
}
