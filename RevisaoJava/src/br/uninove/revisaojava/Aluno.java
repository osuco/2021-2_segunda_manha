package br.uninove.revisaojava;

                     //é
public class Aluno extends Pessoa {
    
    private int ra;
    private Curso curso;

    public Aluno(String nome, String email, String cpf, int idade, int ra) {
        super(nome, email, cpf, idade);
        this.ra = ra;
    }
    
    public Aluno(int ra, String email) {
        super.setEmail(email);
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

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
