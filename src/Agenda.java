package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    
    // Adiciona contato na agenda.
    public void adicionar(Contato contato){
        Contato busca = this.buscar(contato.nome);
        if (busca != null) this.alterar(contato);
        else this.contatos.add(contato);
    }

    // Busca contato e o retorna, retorna null caso nao encontre.
    public Contato buscar(String nome){
        for (Contato contato : this.contatos) {
            if (contato.nome.contains(nome)) return contato;
        }
        return null;
    }
 
    // Altera as informacoes de um contato existente.
    public void alterar(Contato contato){
        Contato busca = this.buscar(contato.nome);
        if (busca != null){
            System.out.println("Alterar informacoes de " + busca.nome + "?");
            if (confirmar()){
                busca.telefone = contato.telefone;
                if (contato.endereco != null) busca.endereco = contato.endereco;
                if (contato.relacao != null) busca.relacao = contato.relacao;
            }
        }
    }
    
    // Busca contato pelo nome e remove da agenda.
    public void remover(String nome){
        Contato busca = this.buscar(nome);
        if (busca != null){
            System.out.println("Remover " + busca.nome + "?");
            if (confirmar()) this.contatos.remove(busca);
        }
    }

    // Lista todos os contatos da agenda.
    public void listar(){
        for (Contato contato: this.contatos){
            System.out.println(contato.nome);
            System.out.println(contato.telefone);
            System.out.println(contato.endereco);
            System.out.println(contato.relacao);
            System.out.println();
        }
    }

    private boolean confirmar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Confirmar? (S/N)");
        String resp = sc.nextLine().toString().toLowerCase();

        return resp.equals("s");
    }
}