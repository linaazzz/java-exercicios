import java.util.ArrayList;

public class Pizza {
    private String nome;
    private float valor;
    private ArrayList<String> ingredientes;

    public Pizza(String nome, float valor, ArrayList<String> ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public static ArrayList<Pizza> criarPizzas() {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Mussarela", 25.0f, new ArrayList<String>() {{
            add("Mussarela");
            add("Tomate");
        }}));
        pizzas.add(new Pizza("Calabresa", 28.0f, new ArrayList<String>() {{
            add("Calabresa");
            add("Cebola");
        }}));
        pizzas.add(new Pizza("Portuguesa", 30.0f, new ArrayList<String>() {{
            add("Presunto");
            add("Mussarela");
            add("Ovo");
            add("Cebola");
            add("Azeitona");
            add("Pimentão");
            add("Tomate");
        }}));
        pizzas.add(new Pizza("Dois amores", 43.5f, new ArrayList<String>() {{
            add("Chocolate branco");
            add("Chocolate preto");
            add("Leite condensado");
        }}));
        return pizzas;
    }
}