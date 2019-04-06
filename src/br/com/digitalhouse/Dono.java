package br.com.digitalhouse;

public class Dono {

    private String nome;
    public String sexo;

    //construtor especifico
    public Dono(String novoNome){
        nome = novoNome;
    }

    //construtor padrao
    public Dono(){

    }

    //alimentar
    public void alimentar(Cachorro catchorro) {
        System.out.println("Olá " + catchorro.nome + "!");
    }

    //Get
    public String getNome() {
        return nome;
    }

    //Set
    public void setNome(String novoNome) {
        nome = novoNome;
    }

}
