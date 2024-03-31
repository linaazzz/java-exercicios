public class Contato {
    private String nome;
    private String telefone;

    Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setTelefone(String telefone){
        this.telefone = telefone;
    }

    String getTelefone(){
        return this.telefone;
    }
}