package src;
import java.io.Serializable;

public class Contato implements Serializable{
    String nome;
    int telefone;
    String endereco;
    String relacao;

    public Contato(String nome, int numero, String endereco, String relacao){
        this.nome = nome;
        this.telefone = numero;
        this.endereco = endereco;
        this.relacao = relacao;
    }
    public Contato(String nome, int numero){
        this(nome, numero, null, null);
    }
    public Contato(String nome, int numero, String endereco){
        this(nome, numero, endereco, null);
    }
    
}