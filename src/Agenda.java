package src;
import java.util.ArrayList;
import java.util.Iterator;

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
            busca.telefone = contato.telefone;
            busca.endereco = contato.endereco;
            busca.relacao = contato.relacao;
        }
    }
    
    // Busca contato pelo nome e remove da agenda.
    public void remover(String nome){
        Contato busca = this.buscar(nome);
        if (busca != null){
            this.contatos.remove(busca);
        }
    }

    // Lista todos os contatos da agenda.
    public void listar(){
        Iterator<Contato> it = this.contatos.iterator();
        while (it.hasNext()){
            it.next();
            System.out.println("Nome: " + it.toString());
            System.out.println();
        }
    }
}