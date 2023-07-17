package src;

public class Main {
    public static void main(String argv[]){
        Agenda agenda = new Agenda();
        
        agenda.adicionar(new Contato("Fulano", 99999999, "Rua A", "UFF"));
        agenda.adicionar(new Contato("Ciclano", 88888888, "Rua B", "Cederj"));
        agenda.adicionar(new Contato("Beltrano", 88889999, "Rua C", "Infancia"));

        agenda.adicionar(new Contato("Fulano", 77777777, "Rua D"));
        agenda.remover("Ciclano");
        
        agenda.listar();
    }
    
}