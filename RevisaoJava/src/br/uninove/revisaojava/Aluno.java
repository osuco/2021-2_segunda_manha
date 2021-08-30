package br.uninove.revisaojava;

                     //é
public class Aluno extends Pessoa {
    
    private int ra;

    public Aluno(String nome, String email, String cpf, int idade, int ra) {
        super(nome, email, cpf, idade);
        this.ra = ra;
    }

    public Aluno() {
        super();
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
