package br.uninove.revisaojava;

public class Professor extends Pessoa {

    private int matricula;
    private int cargaHoraria;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Nome do professor: " + getNome()
                + "\nIdade do professor: " + getIdade()
                + "\nE-Mail do professor: " + getEmail()
                + "\nMatricula do professor: " + getMatricula()
                + "\nCH do professor: " + getCargaHoraria();
    }
}
